package com.incidentanalysis.backend.service;

import com.incidentanalysis.backend.model.Category;
import com.incidentanalysis.backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Long id, Category updatedCategory) {
        Category existingCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        existingCategory.setName(updatedCategory.getName());
        existingCategory.setDescription(updatedCategory.getDescription());
        existingCategory.setColor(updatedCategory.getColor());
        existingCategory.setType(updatedCategory.getType());
        existingCategory.setCreatedDate(updatedCategory.getCreatedDate());

        return categoryRepository.save(existingCategory);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}