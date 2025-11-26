package com.guilherramalho.course.repositories;

import com.guilherramalho.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
