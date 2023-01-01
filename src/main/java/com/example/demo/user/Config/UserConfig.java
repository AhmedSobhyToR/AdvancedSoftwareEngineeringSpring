package com.example.demo.user.Config;

import com.example.demo.user.model.Account;
import com.example.demo.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            repository.save(new Account(1L, "admin", "123", true));
        };
    }
}
