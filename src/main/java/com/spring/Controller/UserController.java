package com.spring.Controller;

import com.spring.Controller.Exceptions.FieldInvalidException;
import com.spring.Dto.UserDto;
import com.spring.Dto.UserRegisterDto;
import com.spring.Dto.ReponseStructDto;
import com.spring.Service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
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
    public ResponseEntity<ReponseStructDto<UserRegisterDto>> addUser(HttpServletRequest request,
                                                                     @Valid @RequestBody UserRegisterDto user,
                                                                     BindingResult bindingResult) {


       if(bindingResult.hasFieldErrors()){
           FieldError fieldError = bindingResult.getFieldError();
           throw new FieldInvalidException(fieldError.getDefaultMessage(), request.getRequestURI());
       }
       userService.add(user);

       ReponseStructDto<UserRegisterDto> response = new ReponseStructDto<>(HttpStatus.CREATED, user,
               "Usuario Criado com sucessp", request.getRequestURI());

       return ResponseEntity.ok().body(response);
    }
}
