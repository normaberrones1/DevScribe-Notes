package com.berrones.devscribenotes.adapters.serviceimpl;

import com.berrones.devscribenotes.domain.entity.User;
import com.berrones.devscribenotes.ports.UserRepository;
import com.berrones.devscribenotes.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;

@RequiredArgsConstructor
@Service
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
