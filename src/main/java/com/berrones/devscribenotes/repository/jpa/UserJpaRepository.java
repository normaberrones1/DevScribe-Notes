package com.berrones.devscribenotes.repository.jpa;

import com.berrones.devscribenotes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
