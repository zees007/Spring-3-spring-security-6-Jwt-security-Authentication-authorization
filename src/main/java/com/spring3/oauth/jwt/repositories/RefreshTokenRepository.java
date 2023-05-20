package com.spring3.oauth.jwt.repositories;

import com.spring3.oauth.jwt.helpers.RefreshableCRUDRepository;
import com.spring3.oauth.jwt.models.RefreshToken;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author mhmdz
 * Created By Zeeshan on 20-05-2023
 * @project oauth-jwt
 */
@Repository
public interface RefreshTokenRepository extends RefreshableCRUDRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByToken(String token);
}
