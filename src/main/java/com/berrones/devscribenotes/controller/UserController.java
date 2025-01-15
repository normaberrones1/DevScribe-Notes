package com.berrones.devscribenotes.controller;

import com.berrones.devscribenotes.entity.User;
import com.berrones.devscribenotes.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable UUID id) {
        return userService.findUserById(id);
    }





}
