package com.incidentanalysis.backend.controller;

import com.incidentanalysis.backend.model.Category;
import com.incidentanalysis.backend.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/categories")
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/categories")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @PutMapping("/api/categories/{id}")
    public Category updateCategory(
            @PathVariable Long id,
            @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/api/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}