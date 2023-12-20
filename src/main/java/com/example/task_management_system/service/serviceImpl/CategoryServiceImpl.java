package com.example.task_management_system.service.serviceImpl;

import com.example.task_management_system.entity.Category;
import com.example.task_management_system.repository.CategoryRepository;
import com.example.task_management_system.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category saveCategoryByName(String categoryName) {
        if (!categoryName.equals("")){
            Category category = new Category();
            category.setName(categoryName);
            return categoryRepository.save(category);

        }
        return null;
    }
}
