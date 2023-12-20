package com.example.task_management_system.dto.categoriesDTO;

import com.example.task_management_system.dto.userDTO.UpdateUserRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateTodoResponseDTO {
    private CreateCategoryRequestDTO createCategoryRequestDTO;
    private String title;
    private UpdateUserRequestDTO updateUserRequestDTO;
    private String status;
}
