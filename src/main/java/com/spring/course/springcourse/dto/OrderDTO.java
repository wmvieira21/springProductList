package com.spring.course.springcourse.dto;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.course.springcourse.entities.Order;
import com.spring.course.springcourse.entities.OrderItem;
import com.spring.course.springcourse.entities.Payment;
import com.spring.course.springcourse.entities.User;
import com.spring.course.springcourse.entities.enums.OrderStatus;

public class OrderDTO {

	private Long id;
	private Instant moment;
	private Integer orderStatus;
	private User client;
	private Payment payment;
	private Set<OrderItem> items;
	private Double total;

	public OrderDTO(Order order) {
		BeanUtils.copyProperties(order, this);
		setItems(order.getItems());
		setTotal(order.getTotal());
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

	public void setItems(Set<OrderItem> items) {
		this.items = items;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}
