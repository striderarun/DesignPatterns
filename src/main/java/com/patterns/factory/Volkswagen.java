package com.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class Volkswagen extends Car {

	static
	{
		CarFactory.getInstance().registerProduct("Volkswagen", new Volkswagen());
	}
	
	@Override
	public Car createProduct() {
		return new Volkswagen();
	}

	@Override
	public String carDescription() {
		return "This is a Volkswagen";
	}

}
