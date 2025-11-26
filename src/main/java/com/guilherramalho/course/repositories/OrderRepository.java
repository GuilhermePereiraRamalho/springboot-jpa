package com.guilherramalho.course.repositories;

import com.guilherramalho.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
