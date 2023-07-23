package com.spring.course.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.course.springcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
