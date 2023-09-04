package com.miranda.tasks.models.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data // create getters and setters
@Entity // Indicates that it is an entity of the database
@AllArgsConstructor // Creates a constructor with all attributes
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID code_user; // attribute of the table
    private String username;
    private String email;
    private String password;
}
