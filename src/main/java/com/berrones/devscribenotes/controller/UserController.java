package com.berrones.devscribenotes.controller;

import com.berrones.devscribenotes.domain.entity.User;
import com.berrones.devscribenotes.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
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
