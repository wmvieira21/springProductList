package com.spring.course.springcourse.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.course.springcourse.dto.UserDTO;
import com.spring.course.springcourse.entities.User;
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

	@PostMapping
	public ResponseEntity<UserDTO> insertUser(@RequestBody User user) {
		UserDTO obj = userService.insert(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public UserDTO updateUser(@PathVariable Long id, @RequestBody User user) {
		return userService.update(id, user);
	}
}
