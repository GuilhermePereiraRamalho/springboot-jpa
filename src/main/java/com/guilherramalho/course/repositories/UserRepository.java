package com.guilherramalho.course.repositories;

import com.guilherramalho.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
