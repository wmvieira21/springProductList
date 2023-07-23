package com.spring.course.springcourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.course.springcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
