package com.example.task_management_system.service;

import com.example.task_management_system.entity.Category;

public interface CategoryService {
    Category saveCategoryByName(String categoryName);
}
