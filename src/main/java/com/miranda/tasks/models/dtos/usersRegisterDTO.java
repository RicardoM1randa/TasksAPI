package com.miranda.tasks.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class usersRegisterDTO {
    
    @NotEmpty(message = "Name is required")
    @Size(min = 5, message = "Name must have at least 5 chars")
    private String username;
    
    @NotEmpty(message = "correo es requerido")
    @Pattern(regexp = "^[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+$")
    private String email;

    @NotEmpty(message = "la Contraseña no puede estar vacia")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,32}$")
	private String Password;

}
