package com.spring.course.springcourse.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.course.springcourse.dto.ProductDTO;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<ProductDTO> findAll() {
		return productRepository.findAll().stream().map(ProductDTO::new).toList();
	}

	public ProductDTO findById(Long id) {
		return new ProductDTO(productRepository.findById(id).get());
	}
}
