package com.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class Sedan extends Car {

	static
	{
		CarFactory.getInstance().registerProduct("Sedan", new Sedan());
	}
	
	@Override
	public Car createProduct() {
		return new Sedan();
	}

	@Override
	public String carDescription() {
		return "This is a Sedan";
	}

}
