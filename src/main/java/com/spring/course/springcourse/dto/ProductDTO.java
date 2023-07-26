package com.spring.course.springcourse.dto;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.course.springcourse.entities.Category;
import com.spring.course.springcourse.entities.OrderItem;
import com.spring.course.springcourse.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;

	private Set<Category> categories = new HashSet<>();

	private Set<OrderDTO> orders = new HashSet<>();

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Product product) {
		BeanUtils.copyProperties(product, this);
		this.categories = product.getCategories();
		this.orders = product.getOrders();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public Set<OrderDTO> getOrders() {
		return this.orders;
	}
}
