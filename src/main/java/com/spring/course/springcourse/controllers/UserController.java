package com.spring.course.springcourse.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.course.springcourse.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "william", "a@gmail.com", "475454", "pass");
		return ResponseEntity.ok().body(user);
	}
}
