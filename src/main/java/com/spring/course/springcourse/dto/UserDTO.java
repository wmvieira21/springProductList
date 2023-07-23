package com.spring.course.springcourse.dto;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.course.springcourse.entities.Order;
import com.spring.course.springcourse.entities.User;

public class UserDTO {

	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private List<Order> orders;

	public UserDTO() {
	}

	public UserDTO(User user) {
		BeanUtils.copyProperties(user, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
