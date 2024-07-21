package com.spring.Service;

import com.spring.Dto.UserDto;
import com.spring.Repository.UserRepository;
import com.spring.Dominio.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDto> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(UserDto::new).toList();
    }

    public void add(User user) {
        userRepository.save(user);
    }
}
