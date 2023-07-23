package com.spring.course.springcourse.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.course.springcourse.dto.UserDTO;
import com.spring.course.springcourse.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserDTO> findAll() {
		return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}

	public UserDTO findById(Long id) {
		return new UserDTO(userRepository.findById(id).get());
	}
}
