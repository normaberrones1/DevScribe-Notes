package com.berrones.devscribenotes.service;


import com.berrones.devscribenotes.entity.User;

import java.util.UUID;

public interface UserService {


    User createUser(User user);

    User findUserById(UUID userId);
}
