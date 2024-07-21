package com.spring.Controller;

import com.spring.Dominio.User;
import com.spring.Repository.UserRepository;
import com.spring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {

        return ResponseEntity.ok().body(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {

        userService.add(user);

        return ResponseEntity.ok().body(user);
    }
}
