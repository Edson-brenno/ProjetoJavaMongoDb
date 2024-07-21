package com.spring.Controller;

import com.spring.Dominio.User;
import com.spring.Dto.UserDto;
import com.spring.Dto.UserRegisterDto;
import com.spring.Repository.UserRepository;
import com.spring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {
        List<User> users = userService.findAll();
        List<UserDto> usersDto = users.stream().map(UserDto::new).toList();
        return ResponseEntity.ok().body(usersDto);
    }

    @PostMapping
    public ResponseEntity<UserRegisterDto> addUser(@RequestBody UserRegisterDto user) {

        userService.add(new User(user.getName(), user.getEmail(), user.getPassword()));

        return ResponseEntity.ok().body(user);
    }
}
