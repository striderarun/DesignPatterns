package com.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class Luxury extends Car {

	static {
		CarFactory.getInstance().registerProduct("Luxury", new Luxury());
	}
	
	@Override
	public Car createProduct() {
		return new Luxury();
	}

	@Override
	public String carDescription() {
		return "This is a Luxury car";
	}

}
