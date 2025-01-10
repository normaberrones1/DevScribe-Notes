package com.berrones.devscribenotes.service;

import com.berrones.devscribenotes.entity.User;
import com.berrones.devscribenotes.repository.jpa.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserJpaRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }
}
