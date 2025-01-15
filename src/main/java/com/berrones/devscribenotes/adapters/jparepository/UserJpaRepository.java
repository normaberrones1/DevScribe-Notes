package com.berrones.devscribenotes.adapters.jparepository;

import com.berrones.devscribenotes.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserJpaRepository extends JpaRepository<User, UUID> {


}
