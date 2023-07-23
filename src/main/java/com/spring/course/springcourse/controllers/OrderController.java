package com.spring.course.springcourse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.course.springcourse.dto.OrderDTO;
import com.spring.course.springcourse.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping
	public List<OrderDTO> findAll() {
		return orderService.findAll();
	}

	@GetMapping(value = "/{id}")
	public OrderDTO findById(@PathVariable Long id) {
		return orderService.findById(id);
	}
}
