package com.spring.course.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.course.springcourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
