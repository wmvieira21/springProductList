package com.spring.course.springcourse.exceptions;

public class ResourceNotFoundExpection extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExpection(Object id) {
		super("Resource not found. ID=" + id);
	}
}
