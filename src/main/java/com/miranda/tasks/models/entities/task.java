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

@Data
@Entity
@AllArgsConstructor
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID code_task;
    private String name;
    private String description;
    private String status;
    @ManyToOne
    @JoinColumn(name = "code_user")
    private user user;
}
