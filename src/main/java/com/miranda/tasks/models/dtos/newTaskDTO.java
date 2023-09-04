package com.miranda.tasks.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class newTaskDTO {
    
    @NotEmpty(message = "Name is required")
    @Size(min = 2, message = "Task name must have at least 2 chars")
    private String name;

    @NotEmpty(message = "Description is required")
    @Size(min = 5, message = "Description must have at least 5 chars")
    private String description;

    //set status bollean on false by default
    private boolean status = false;

    //set user code
    private String code_user;
    

}
