package com.spring.course.springcourse.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.course.springcourse.dto.OrderDTO;
import com.spring.course.springcourse.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<OrderDTO> findAll() {
		return orderRepository.findAll().stream().map(OrderDTO::new).collect(Collectors.toList());
	}

	public OrderDTO findById(Long id) {
		return new OrderDTO(orderRepository.findById(id).get());
	}
}
