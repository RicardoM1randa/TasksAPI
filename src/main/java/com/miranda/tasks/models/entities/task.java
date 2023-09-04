package com.miranda.tasks.models.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data // create getters and setters
@Entity // indicates that it is an entity of the database
@AllArgsConstructor // creates a constructor with all attributes
public class task {
    @Id // Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private UUID code_task; // attribute of the table
    private String name; 
    private String description; 
    private boolean status;
    @ManyToOne // relation many to one in the database
    @JoinColumn(name = "code_user") // name of the column in the database
    private user user; 
}
