package com.incidentanalysis.backend.repository;

import com.incidentanalysis.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}