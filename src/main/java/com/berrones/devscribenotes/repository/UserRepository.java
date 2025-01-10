package com.berrones.devscribenotes.repository;

import com.berrones.devscribenotes.entity.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public interface UserRepository {

    User findUserById(UUID userId);

    User save(User user);

    void deleteById(UUID userId);

}
