package com.spring.course.springcourse.entities.enums;

import java.util.stream.Stream;

public enum OrderStatus {
	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public static OrderStatus valueOf(int code) {
		return Stream.of(OrderStatus.values())
				.filter((c) -> c.getCode() == code)
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Order status code invalid"));
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
