package com.example.task_management_system.mapper;


import com.example.task_management_system.dto.userDTO.CreateUserRequestDTO;
import com.example.task_management_system.dto.userDTO.CreateUserResponseDTO;
import com.example.task_management_system.dto.userDTO.UpdateUserRequestDTO;
import com.example.task_management_system.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User mapToUser(CreateUserRequestDTO request);

    User mapToUser(UpdateUserRequestDTO request);

    CreateUserResponseDTO mapToDto(User user);
}
