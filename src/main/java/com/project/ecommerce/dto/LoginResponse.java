package com.project.ecommerce.dto;

import lombok.Getter;

@Getter
public class LoginResponse {

    private String token;
    private long expiresIn;

    public void setExpiresIn(long expiresIn){
        this.expiresIn= expiresIn;
    }

    public void setToken(String token){
        this.token = token;
    }
}
