package com.authenticate.AuthenticateMe.dto.request;

import lombok.Data;

@Data
public class UserRequest {
    private String email;
    private String password;

}
