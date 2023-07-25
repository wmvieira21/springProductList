package com.spring.course.springcourse.dto;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import com.spring.course.springcourse.entities.Order;
import com.spring.course.springcourse.entities.OrderItem;
import com.spring.course.springcourse.entities.User;
import com.spring.course.springcourse.entities.enums.OrderStatus;

public class OrderDTO {

	private Long id;
	private Instant moment;
	private Integer orderStatus;
	private User client;
	private Set<OrderItem> items = new HashSet<>();

	public OrderDTO(Order order) {
		BeanUtils.copyProperties(order, this);
		items = order.getItems();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public OrderStatus getOrderStatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus.getCode();
	}

	public Set<OrderItem> getItems() {
		return items;
	}
}
