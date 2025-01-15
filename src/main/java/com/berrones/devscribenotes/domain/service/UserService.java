package com.berrones.devscribenotes.domain.service;


import com.berrones.devscribenotes.domain.entity.User;

import java.util.UUID;

public interface UserService {


    User createUser(User user);

    User findUserById(UUID userId);
}
