package com.example.demo.user.controller;

import com.example.demo.user.model.Account;
import com.example.demo.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/users")
    public ResponseEntity<Void> addStudent(@RequestBody Account account) {
        userService.addStudent(account);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(value = "/users/all")
    public List<Account> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "/users/login")
    public Optional<Account> findByEmailPass(@RequestParam("email") String email, @RequestParam("password") String password) {
        return userService.findByEmailPass(email, password);
    }

    @GetMapping(value = "/users/search/id/{id}")
    public Optional<Account> findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }
}
