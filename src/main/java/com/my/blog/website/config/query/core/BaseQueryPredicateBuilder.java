package com.my.blog.website.config.query.core;

import com.my.blog.website.config.query.Where;
import com.my.blog.website.config.query.annotation.QBindAttrField;
import com.my.blog.website.config.query.annotation.QBindEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * query转换builder类
 *
 * @author mj 2016年10月26日 下午3:54:41
 */
public class BaseQueryPredicateBuilder {

    private static Logger log = LogManager.getLogger(BaseQueryPredicateBuilder.class);

    public static <T> Predicate getPredicate(Root<T> root, CriteriaBuilder cb, BaseQuery query) {
        List<Predicate> predicatesAnd = new ArrayList<>();
        try {
            Class<?> entityClass = queryEntity(query);
            if (entityClass == null) {
                // 是否返回NULL，待研究
                return null;
            }
            BeanInfo beanInfo = Introspector.getBeanInfo(query.getClass());
            PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor pd : pds) {
                Method readMethod = pd.getReadMethod();
                String pdName = pd.getName();
                if ((pdName.indexOf("Page") == 0) || (pdName.indexOf("Sort") == 0)) {
                    continue;
                }
                if (!pdName.equals("class")) {
                    Object obj = readMethod.invoke(query);
                    if (obj != null) {
                        QBindAttrField fieldProp = (QBindAttrField) getBindFieldName(query, pdName);
                        initPredicatesAndByObj(predicatesAnd, pd, cb, obj, root, fieldProp);
                    }
                }

            }
        } catch (Exception e) {
            log.error(e);
        }

        // 组合条件
        if (predicatesAnd.isEmpty()) {
            return cb.isTrue(cb.literal(true));
        }

        if (predicatesAnd.size() == 1) {
            return predicatesAnd.iterator().next();
        }
        return cb.and(predicatesAnd.toArray(new Predicate[predicatesAnd.size()]));
    }

    private static <T> void initPredicatesAndByObj(List<Predicate> predicatesAnd, PropertyDescriptor pd, CriteriaBuilder cb, Object obj, Root<T> root, QBindAttrField fieldProp) {
        String bindAttrName = fieldProp.fieldName();
        Expression expression = root.get(bindAttrName);
        Where where = fieldProp.where();
        switch (where) {
            case equal:
                predicatesAnd.add(cb.equal(expression, obj));
                break;
            case greaterThanOrEqualTo:
                predicatesAnd.add(cb.greaterThanOrEqualTo(expression, (Comparable) obj));
                break;
            case lessThanOrEqualTo:
                predicatesAnd.add(cb.lessThanOrEqualTo(expression, (Comparable) obj));
                break;
            case like:
                predicatesAnd.add(cb.like(expression, "%" + obj + "%"));
                break;
            case greaterThan:
                predicatesAnd.add(cb.greaterThan(expression, (Comparable) obj));
                break;
            case lessThan:
                predicatesAnd.add(cb.lessThan(expression, (Comparable) obj));
                break;
            case notEqual:
                predicatesAnd.add(cb.notEqual(expression, obj));
                break;
            case in:
                predicatesAndAddIn(predicatesAnd, pd, (Comparable) obj, expression);
                // 特殊处理
                break;
            default:// 默认等于equal
                break;
        }
    }

    /**
     * 处理in 查询
     *
     * @param predicatesAnd 前置条件集合，不能为null，可为空。
     * @param pd            属性描述（字段描述），参与in查询的列对应的属性
     * @param obj           in查询所需要的值集合
     * @param expression    表达式
     */
    private static void predicatesAndAddIn(List<Predicate> predicatesAnd, PropertyDescriptor pd, Comparable obj, Expression expression) {
        if (pd.getPropertyType().getName().indexOf("List") > 0) {
            List<?> value = (List<?>) obj;
            if (value.size() == 0) {
                // 防止生成LIST时，没有传入值，而查询条件会做全查处理，此处做特殊处理返回空条件
                ((List<?>) obj).add(null);
            }
            if (value.size() > 20) {
                Set<Object> set = new HashSet<>(value.size());
                // 如果in超过20个要去重处理
                set.addAll(value);
                value = new ArrayList<>(set);
            }
            predicatesAnd.add(expression.in(value));
        } else {
            List vList = new ArrayList<>();
            vList.add(obj);
            predicatesAnd.add(expression.in(vList));
        }
    }

    /**
     * 获取查询实体类名称
     *
     * @param query
     * @return
     * @author liuyi 2016年4月16日
     */
    public static Class<?> queryEntity(BaseQuery query) {
        Annotation anno = query.getClass().getAnnotation(QBindEntity.class);
        if (anno != null) {
            return ((QBindEntity) anno).entityClass();
        }
        return null;
    }

    /**
     * 获取绑定字段属性值
     *
     * @param PropertyName
     * @return
     * @author liuyi 2016年4月16日
     */
    public static Annotation getBindFieldName(BaseQuery query, String PropertyName) {
        try {
            Field field = query.getClass().getDeclaredField(PropertyName);
            Annotation anno = field.getAnnotation(QBindAttrField.class);
            if (anno != null) {
                return ((QBindAttrField) anno);
            }
        } catch (SecurityException e) {
            log.error("[BaseQueryPredicateBuilder.getBindAttrName SecurityException:]" + e.getMessage());
        } catch (NoSuchFieldException e) {
            log.error("[BaseQueryPredicateBuilder.getBindAttrName NoSuchFieldException:]" + e.getMessage());
        }
        return null;
    }

}