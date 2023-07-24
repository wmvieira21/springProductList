package com.spring.course.springcourse.dto;

import org.springframework.beans.BeanUtils;

import com.spring.course.springcourse.entities.Category;

public class CategoryDTO {

	private Long id;
	private String name;

	public CategoryDTO() {
	}

	public CategoryDTO(Category category) {
		BeanUtils.copyProperties(category, this);
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
}
