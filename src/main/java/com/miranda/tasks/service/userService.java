package com.miranda.tasks.service;

import com.miranda.tasks.models.dtos.usersRegisterDTO;
import com.miranda.tasks.models.entities.user;

public interface UserService {
    void save(usersRegisterDTO userDTO) throws Exception; // create user method
    user findByUsername(String username) throws Exception; // find user by username method
}
