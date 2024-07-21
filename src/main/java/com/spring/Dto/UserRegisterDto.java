package com.spring.Dto;

import java.io.Serializable;

public class UserRegisterDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private String password;

    public UserRegisterDto() {}

    public UserRegisterDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
