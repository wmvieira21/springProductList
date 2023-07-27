package com.spring.course.springcourse.services;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.spring.course.springcourse.dto.UserDTO;
import com.spring.course.springcourse.entities.User;
import com.spring.course.springcourse.exceptions.DataBaseException;
import com.spring.course.springcourse.exceptions.ResourceNotFoundExpection;
import com.spring.course.springcourse.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserDTO> findAll() {
		return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
	}

	public UserDTO findById(Long id) {
		return new UserDTO(userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExpection(id)));
	}

	public UserDTO insert(User user) {
		return new UserDTO(userRepository.save(user));
	}

	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}

	public UserDTO update(Long id, User user) {
		try {
			User obj = userRepository.getReferenceById(id);
			updateUser(obj, user);
			
			return new UserDTO(userRepository.save(obj));
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundExpection(id);
		}
	}

	private void updateUser(User obj, User user) {
		obj.setName(user.getName());
		obj.setPhone(user.getPhone());
		obj.setEmail(user.getEmail());
	}
}
