package com.miranda.tasks.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miranda.tasks.models.entities.user;

public interface userRepository extends JpaRepository<user, UUID>{
    user findByUsername(String username);
}
