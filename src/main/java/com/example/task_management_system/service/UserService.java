package com.example.task_management_system.service;

import com.example.task_management_system.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserByEmail(String email);

    User save(User user);

    Optional<User> getUserById(int id);

    void deleteUserById(int id);

    void updateUserData(User user);
}
