package com.miranda.tasks.models.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // create getters and setters
@Entity // Indicates that it is an entity of the database
@NoArgsConstructor // Creates a constructor with all attributes
@Table(name = "users") // Indicates the name of the table in the database
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID code_user; // attribute of the table
    private String username;
    private String email;
    private String password;
}
