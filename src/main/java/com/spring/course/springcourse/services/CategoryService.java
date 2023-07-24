package com.spring.course.springcourse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.course.springcourse.dto.CategoryDTO;
import com.spring.course.springcourse.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<CategoryDTO> findAll() {
		return categoryRepository.findAll().stream().map(CategoryDTO::new).toList();
	}

	public CategoryDTO findById(Long id) {
		return new CategoryDTO(categoryRepository.findById(id).get());
	}
}
