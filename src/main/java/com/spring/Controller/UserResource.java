package com.spring.Controller;

import com.spring.Entities.User;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "Brenno1", "brenno1@gamil.com"));
        users.add(new User(2, "Brenno2", "brenno2@gamil.com"));
        users.add(new User(3, "Brenno3", "brenno3@gamil.com"));
        users.add(new User(4, "Brenno4", "brenno4@gamil.com"));

        return ResponseEntity.ok().body(users);
    }
}
