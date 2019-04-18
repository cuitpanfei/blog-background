package com.my.blog.website.config.jpa;

import com.my.blog.website.config.query.core.BaseQuery;
import com.my.blog.website.config.query.core.BaseQueryPredicateBuilder;
import com.my.blog.website.config.query.core.BaseRepository;
import com.my.blog.website.config.query.core.QueryToSpecification;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * 扩展对JAP功能加强
 *
 * @author liuyi  2016年4月16日 下午2:40:16
 */
@NoRepositoryBean
@Transactional(propagation = Propagation.SUPPORTS)
public class BaseSimpleJpaRepositoryEx<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    private static Logger log = LogManager.getLogger(BaseSimpleJpaRepositoryEx.class);

    private EntityManager baseEm;
    private JpaEntityInformation<T, ?> baseEmInfo;

    /**
     * BaseSimpleJpaRepositoryEx 构造器
     *
     * @param domainClass
     * @param em
     */
    public BaseSimpleJpaRepositoryEx(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        baseEm = em;
        baseEmInfo = JpaEntityInformationSupport.getEntityInformation(domainClass, em);
    }

    /**
     * 自定义查询条件转换实现
     * <p>
     * (non-Javadoc)
     */
    private Specification<T> getConditonByQuery(BaseQuery query) {
        return new QueryToSpecification(query);
    }

    /**
     * 封装自定义组合查询列表方法
     * <p>
     * (non-Javadoc)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll(BaseQuery query) {
        if (query.getSort() != null) {
            return findAll(getConditonByQuery(query), query.getSort());
        } else if (query.getPage() != null) {
            return (List<T>) findAll(getConditonByQuery(query), query.getPage());

        } else {
            return findAll(getConditonByQuery(query));
        }

    }

    /**
     * 自定义组合查询分页方法
     *
     * @param query
     * @param pageable
     * @return
     * @author liuyi 2016年4月18日
     */
    @Override
    public Page<T> findAll(BaseQuery query, Pageable pageable) {
        return findAll(getConditonByQuery(query), pageable);
    }

    /**
     * 查询条件
     * <p>
     * (non-Javadoc)
     */
    @Override
    public T findOne(BaseQuery query) {
        return findOne(getConditonByQuery(query));
    }


    /**
     * 封装自定义组合查询排序列表方法
     * <p>
     * (non-Javadoc)
     */
    @Override
    public List<T> findAll(BaseQuery query, Sort sort) {
        return findAll(getConditonByQuery(query), sort);
    }


    /**
     * 自定义更新update方法
     *
     * @param
     * @param where
     * @return
     * @author liuyi 2016年7月16日
     */
    @Override
    @Transactional
    public int update(T t, BaseQuery where, String... updateFileds) {
        CriteriaBuilder cb = baseEm.getEntityManagerFactory().getCriteriaBuilder();
        CriteriaUpdate<T> update = (CriteriaUpdate<T>) cb.createCriteriaUpdate(t.getClass());
        Root<T> root = update.from((Class<T>) t.getClass());

        Arrays.stream(updateFileds).forEach(fieldName -> {
            try {
                Object o = PropertyUtils.getProperty(t, fieldName);
                update.set(fieldName, o);
            } catch (Exception e) {
                log.error("update error:" + e);
            }
        });
        update.where(BaseQueryPredicateBuilder.getPredicate(root, cb, where));
        return baseEm.createQuery(update).executeUpdate();
    }

    /**
     * 根据唯一主键更新相关数据
     *
     * @param id
     * @param
     * @return
     * @author liuyi 2016年7月16日
     */
    @Override
    @Transactional
    public int updateById(T t, ID id, String... updateFileds) {
        CriteriaBuilder cb = baseEm.getEntityManagerFactory().getCriteriaBuilder();
        CriteriaUpdate<T> update = (CriteriaUpdate<T>) cb.createCriteriaUpdate(t.getClass());
        Root<T> root = update.from((Class<T>) t.getClass());
        for (String fieldName : updateFileds) {
            try {
                Object o = PropertyUtils.getProperty(t, fieldName);
                update.set(fieldName, o);
            } catch (Exception e) {
                log.error("update error:" + e);
            }
        }
        //定位主键信息
        Iterable<String> idAttributeNames = baseEmInfo.getIdAttributeNames();

        for (String key : idAttributeNames) {
            if (key != null && key != "") {
                update.where(cb.equal(root.get(key), id));
                break;
            }
        }
        return baseEm.createQuery(update).executeUpdate();
    }


}