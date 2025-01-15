package com.berrones.devscribenotes.ports;

import com.berrones.devscribenotes.domain.entity.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface UserRepository {

    User createUser(User user);

    User findUserById(UUID userId);

}
