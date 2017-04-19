package com.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class Benz extends Car {

	static
	{
		CarFactory.getInstance().registerProduct("Benz", new Benz());
	}
	
	@Override
	public Car createProduct() {
		return new Benz();
	}

	@Override
	public String carDescription() {
		return "This is a Benz";
	}

}
