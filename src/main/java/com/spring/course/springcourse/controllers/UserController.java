package com.spring.course.springcourse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.course.springcourse.dto.UserDTO;
import com.spring.course.springcourse.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

//	@GetMapping
//	public ResponseEntity<User> findAll(){
//		User user = new User(1L, "william", "a@gmail.com", "475454", "pass");
//		return ResponseEntity.ok().body(user);
//	}

	@GetMapping
	public List<UserDTO> findAll() {
		return userService.findAll();
	}

	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id) {
		return userService.findById(id);
	}
}
