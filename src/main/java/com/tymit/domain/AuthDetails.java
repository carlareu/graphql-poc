package com.tymit.domain;

import lombok.Data;

@Data
public class AuthDetails {
    String phone;
    String email;
    String deviceId;
    String password;
}
