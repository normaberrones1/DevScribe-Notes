package com.berrones.devscribenotes.repository.impl;

import com.berrones.devscribenotes.entity.User;
import com.berrones.devscribenotes.repository.UserRepository;
import com.berrones.devscribenotes.repository.jpa.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public User createUser(User user) {
        userJpaRepository.save(user);
        return user;
    }

    @Override
    public User findUserById(UUID userId) {
        return userJpaRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
    }


}
