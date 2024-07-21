package com.spring.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class UserRegisterDto implements Serializable {
    private static final long serialVersionUID = 1L;


    @NotBlank(message = "Name is required")
    @NotNull
    @Size(min= 2, message = "Name needs to be higher than 2 characters")
    private String name;
    @Email(message = "Email is required")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min=6, message = "Password needs to have at leat 6 charcters")
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
