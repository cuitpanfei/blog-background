package com.my.blog.website.config;

import com.my.blog.website.config.jpa.BaseSimpleJpaRepositoryEx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * 自定义jpa工厂类 可确定具体的实现类
 * Created by mj on 2017/12/20.
 */
public class BaseRepositoryFactoryBean<R extends JpaRepository<T, I>, T,
        I extends Serializable> extends JpaRepositoryFactoryBean<R, T, I> {

    public BaseRepositoryFactoryBean(Class<? extends R> repositoryInterface) {
        super(repositoryInterface);
    }

    @Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager em) {
        return new BaseRepositoryFactory(em);
    }

    private static class BaseRepositoryFactory<T, I extends Serializable>
            extends JpaRepositoryFactory {

        private final EntityManager em;

        public BaseRepositoryFactory(EntityManager em) {
            super(em);
            this.em = em;
        }

        /**
         * 设置具体的实现类是BaseRepositoryImpl
         */
        @Override
        protected Object getTargetRepository(RepositoryInformation information) {
            return new BaseSimpleJpaRepositoryEx<T, I>((Class<T>) information.getDomainType(), em);
        }

        /**
         * 设置具体的实现类的class
         */
        @Override
        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
            return BaseSimpleJpaRepositoryEx.class;
        }
    }
}