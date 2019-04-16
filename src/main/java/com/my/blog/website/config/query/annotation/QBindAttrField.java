package com.my.blog.website.config.query.annotation;

import com.my.blog.website.config.query.Where;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 查询绑定属性
 *
 * @version 
 * @author mj  2016年10月28日 下午6:20:57
 * 
 */
@Target({java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface QBindAttrField {
	String fieldName();
	Where where();
}