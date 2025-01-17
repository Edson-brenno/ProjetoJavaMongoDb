package com.spring.Dominio;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;


@Document(collection = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    @NotBlank(message = "Name is required")
    @NotNull
    @Size(min= 2, message = "Name needs to be higher than 2 characters")
    private String name;
    @Email(message = "Email is required")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min=6, message = "Password needs to have at leat 6 charcters")
    private String password;

    public User(){}

    public User(String name, String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
