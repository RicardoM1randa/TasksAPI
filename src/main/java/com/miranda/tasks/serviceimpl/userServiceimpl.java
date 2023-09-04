package com.miranda.tasks.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miranda.tasks.models.dtos.usersRegisterDTO;
import com.miranda.tasks.models.entities.user;
import com.miranda.tasks.service.userService;
import com.miranda.tasks.repositories.userRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import jakarta.transaction.Transactional;

@Service // Indicates that it is a service class
public class userServiceimpl implements userService{
    
    @Autowired // Injects the repository
    private userRepository userRepository ;
	@Autowired
	private PasswordEncoder passwordEncoder;

    @Override // Indicates that it is a method override
    @Transactional(rollbackOn = Exception.class) // Indicates that it is a transactional method
    public void save(usersRegisterDTO userDTO) throws Exception {
        user user = new user();
        user.setUsername(userDTO.getUsername());
        user.setPassword(passwordEncoder.encode( userDTO.getPassword()));
        userRepository.save(user);
    }

    @Override // Indicates that it is a method override
    public user findByUsername(String username) throws Exception {
        return userRepository.findByUsername(username);
    }
}
