package com.spring.Config;

import com.spring.Dominio.User;
import com.spring.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Homologacao")
public class HomologacaoConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        //Ading users
        userRepository.save(new User("John", "Doe1", "12346"));
        userRepository.save(new User("Jane", "Doe2", "12346"));
        userRepository.save(new User("Jack", "Doe3", "12346"));
        userRepository.save(new User("Caio", "Doe4", "12346"));
    }
}
