package com.example.demo.user.service;

import com.example.demo.user.model.Account;
import com.example.demo.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addStudent(Account account) {
        userRepository.save(account);
    }

    public Optional<Account> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<Account> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Account> findByEmailPass(String email, String password) {
        return userRepository.findByEmailPass(email, password);
    }
}
