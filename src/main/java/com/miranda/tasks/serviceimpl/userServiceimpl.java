package com.miranda.tasks.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.miranda.tasks.models.dtos.usersRegisterDTO;
import com.miranda.tasks.models.entities.user;
import com.miranda.tasks.service.UserService;
import com.miranda.tasks.repositories.userRepository;
import jakarta.transaction.Transactional;

@Service // Indicates that it is a service class
public class userServiceimpl implements UserService{
    
    @Autowired
	private PasswordEncoder passwordEncoder;
    
    @Autowired // Injects the repository
    private userRepository userRepository ;
	

    @Override // Indicates that it is a method override
    @Transactional(rollbackOn = Exception.class) // Indicates that it is a transactional method
    public void save(usersRegisterDTO userDTO) throws Exception {
        user user = new user();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(user);
    }

    @Override // Indicates that it is a method override
    public user findByUsername(String username) throws Exception {
        return userRepository.findByUsername(username);
    }
}
