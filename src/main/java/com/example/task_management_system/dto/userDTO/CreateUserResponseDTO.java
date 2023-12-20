package com.example.task_management_system.dto.userDTO;

import com.example.task_management_system.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserResponseDTO {

    private int id;
    private String name;
    private String surname;
    private String email;
    private Role role;
}
