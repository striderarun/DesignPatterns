package com.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class Hatchback extends Car {

	static
	{
		CarFactory.getInstance().registerProduct("Hatchback", new Hatchback());
	}
	
	@Override
	public Car createProduct() {
		return new Hatchback();
	}

	@Override
	public String carDescription() {
		return "This is a hatchback";
	}

}
