package com.spring.course.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.course.springcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
