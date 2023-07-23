package com.spring.course.springcourse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.course.springcourse.entities.User;
import com.spring.course.springcourse.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User(null, "william", "a@gmail.com", "475454", "pass");
		User user1 = new User(null, "Adri", "asasa@gmail.com", "0000", "pasasass");

		userRepository.saveAll(Arrays.asList(user, user1));
	}

}
