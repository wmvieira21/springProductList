package com.spring.course.springcourse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.course.springcourse.dto.ProductDTO;
import com.spring.course.springcourse.repository.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public List<ProductDTO> findAll() {
		return productService.findAll();
	}

	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		return productService.findById(id);
	}
}
