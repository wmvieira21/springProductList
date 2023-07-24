package com.spring.course.springcourse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.course.springcourse.dto.CategoryDTO;
import com.spring.course.springcourse.services.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<CategoryDTO> findAll() {
		return categoryService.findAll();
	}

	@GetMapping(value = "/{id}")
	public CategoryDTO findByID(@PathVariable Long id) {
		return categoryService.findById(id);
	}
}
