package com.spring.course.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.course.springcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
