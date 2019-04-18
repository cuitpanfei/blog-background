package com.my.blog.website.config.query.core;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * 自定义Query语言转Specification
 *
 * @version 
 * @author zengjq 2016年10月26日 下午3:46:50
 * @param
 * 
 */
public class QueryToSpecification implements Specification {
	private  BaseQuery query;
	
	
	public QueryToSpecification(BaseQuery query) {
		super();
		this.query = query;
	}

	/**
	 * 【请在此输入描述文字】
	 * 
	 * (non-Javadoc)
	 * @see org.springframework.data.jpa.domain.Specification#toPredicate(javax.persistence.criteria.Root, javax.persistence.criteria.CriteriaQuery, javax.persistence.criteria.CriteriaBuilder)
	 */
	@Override
	public Predicate toPredicate(Root root, CriteriaQuery cquery, CriteriaBuilder cb) {
		return BaseQueryPredicateBuilder.getPredicate(root, cb, this.query);
	}

}