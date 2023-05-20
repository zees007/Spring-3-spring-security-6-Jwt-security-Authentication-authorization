package com.spring3.oauth.jwt.repositories;

import com.spring3.oauth.jwt.helpers.RefreshableCRUDRepository;
import com.spring3.oauth.jwt.models.UserInfo;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends RefreshableCRUDRepository<UserInfo, Long> {

   public UserInfo findByUsername(String username);
   UserInfo findFirstById(Long id);

}
