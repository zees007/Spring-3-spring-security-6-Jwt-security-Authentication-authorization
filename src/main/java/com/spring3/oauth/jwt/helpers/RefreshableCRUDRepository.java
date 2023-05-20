package com.spring3.oauth.jwt.helpers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Collection;

@NoRepositoryBean
public interface RefreshableCRUDRepository<T, ID> extends CrudRepository<T, ID> {

    void refresh(T t);

    void refresh(Collection<T> s);

    void flush();
}
