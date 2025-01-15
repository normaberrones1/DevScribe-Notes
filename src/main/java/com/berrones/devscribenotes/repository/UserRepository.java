package com.berrones.devscribenotes.repository;

import com.berrones.devscribenotes.entity.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface UserRepository {

    User createUser(User user);

    User findUserById(UUID userId);

}
