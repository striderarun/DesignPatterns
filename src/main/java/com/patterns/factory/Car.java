package com.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public abstract class Car {

	public abstract Car createProduct();
	public abstract String carDescription();
	
	
}
