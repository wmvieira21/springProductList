package com.spring.course.springcourse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.course.springcourse.entities.Order;
import com.spring.course.springcourse.entities.User;
import com.spring.course.springcourse.entities.enums.OrderStatus;
import com.spring.course.springcourse.repository.OrderRepository;
import com.spring.course.springcourse.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User user = new User(null, "william", "a@gmail.com", "475454", "pass", null);
		User user1 = new User(null, "Adri", "asasa@gmail.com", "0000", "pasasass", null);

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user1);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user);

		userRepository.saveAll(Arrays.asList(user, user1));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
