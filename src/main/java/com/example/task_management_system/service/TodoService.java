package com.example.task_management_system.service;

import com.example.task_management_system.entity.Todo;

import java.util.List;

public interface TodoService {
    Todo saveToto(Todo todo);

    List<Todo> findCurrentUserTodos(int currentUserId);

    Todo findTodoById(int todoId);

    void deleteTodoById(int todoId);
}
