package com.spring.Controller;

import com.spring.Dominio.User;
import com.spring.Dto.UserDto;
import com.spring.Dto.UserRegisterDto;
import com.spring.Dto.ReponseStructDto;
import com.spring.Repository.UserRepository;
import com.spring.Service.UserService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService userService;;

    @GetMapping
    public ResponseEntity<ReponseStructDto<List<UserDto>>> getUsers(HttpServletRequest request) {
        ReponseStructDto<List<UserDto>> reponse = new ReponseStructDto<>(
                HttpStatus.OK, userService.findAll(), "Usuários obtidos com sucesso", request.getRequestURI()
        );
        return ResponseEntity.ok().body(reponse);
    }

    @PostMapping
    public ResponseEntity<UserRegisterDto> addUser(@RequestBody UserRegisterDto user) {

        userService.add(new User(user.getName(), user.getEmail(), user.getPassword()));

        return ResponseEntity.ok().body(user);
    }
}
