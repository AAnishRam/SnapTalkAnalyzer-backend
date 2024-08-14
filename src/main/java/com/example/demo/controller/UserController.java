package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService us;

    @PostMapping("/api/user")
    public ResponseEntity<User> create(@RequestBody User ue) {
        User obj = us.registerUser(ue);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }

    // @GetMapping("/api/user")
    // public ResponseEntity<List<User>> getAll() {
    // List<User> obj = us.getAllUser();
    // return new ResponseEntity<>(obj, HttpStatus.OK);
    // }

    @GetMapping("/api/user/me")
    public ResponseEntity<User> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        User currentUser = (User) authentication.getPrincipal();
        return new ResponseEntity<>(currentUser, HttpStatus.CREATED);

    }

    @GetMapping("/api/user")
    public ResponseEntity<List<User>> allUsers() {
        List<User> users = us.allUsers();
        return new ResponseEntity<>(users, HttpStatus.CREATED);

    }

}
