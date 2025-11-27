package com.guilherramalho.course.repositories;

import com.guilherramalho.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
