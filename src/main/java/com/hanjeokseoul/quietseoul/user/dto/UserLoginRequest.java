package com.hanjeokseoul.quietseoul.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequest {
    private String username;
    private String password;
}
