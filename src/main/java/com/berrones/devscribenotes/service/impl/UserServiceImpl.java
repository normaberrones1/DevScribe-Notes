package com.berrones.devscribenotes.service.impl;

import com.berrones.devscribenotes.entity.User;
import com.berrones.devscribenotes.repository.UserRepository;
import com.berrones.devscribenotes.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public User findUserById(UUID userId) {
        return userRepository.findUserById(userId);
    }



}
