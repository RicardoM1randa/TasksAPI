package com.miranda.tasks.controllers;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miranda.tasks.models.dtos.usersRegisterDTO;
import com.miranda.tasks.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    //dependency injection
    @Autowired
    private UserService userService;

    //register method
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid usersRegisterDTO userDTO) {
        try
        {
            userService.save(userDTO); //save user
            return new ResponseEntity<>(HttpStatus.CREATED); //return status 201
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);  //return status 500
        }
    }

    //login method
   
    
}
