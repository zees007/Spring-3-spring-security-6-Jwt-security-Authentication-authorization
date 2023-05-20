package com.spring3.oauth.jwt.helpers;

import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@NoRepositoryBean
public class RefreshableCRUDRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements RefreshableCRUDRepository<T, ID> {

    private final EntityManager entityManager;

    public RefreshableCRUDRepositoryImpl(JpaEntityInformation entityInformation, EntityManager entityManager){
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void flush(){
        entityManager.flush();
    }

    @Override
    @Transactional
    public void refresh(T t) {
        entityManager.refresh(t);
    }

    @Override
    @Transactional
    public void refresh(Collection<T> s) {
        for (T t: s){
            entityManager.refresh(t);
        }
    }
}
