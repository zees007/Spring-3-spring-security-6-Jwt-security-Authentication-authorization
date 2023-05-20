package com.spring3.oauth.jwt.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class AuthRequestDTO {

    private String username;
    private String password;
}
