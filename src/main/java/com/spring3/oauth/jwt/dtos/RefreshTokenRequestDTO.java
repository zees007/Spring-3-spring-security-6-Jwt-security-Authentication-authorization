package com.spring3.oauth.jwt.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mhmdz
 * Created By Zeeshan on 20-05-2023
 * @project oauth-jwt
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefreshTokenRequestDTO {
    private String token;
}
