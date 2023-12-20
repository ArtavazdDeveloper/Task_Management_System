package com.example.task_management_system.repository;

import com.example.task_management_system.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findAllByUserId(int userId);
}
