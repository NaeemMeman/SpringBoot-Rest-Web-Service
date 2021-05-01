package com.naeemmeman.payroll;

class OrderNotFoundException extends RuntimeException {
	OrderNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
