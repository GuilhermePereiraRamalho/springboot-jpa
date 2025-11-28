package com.guilherramalho.course.repositories;

import com.guilherramalho.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
}
