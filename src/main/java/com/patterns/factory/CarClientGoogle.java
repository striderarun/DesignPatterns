package com.patterns.factory;

import java.util.Set;

import org.reflections.Reflections;

public class CarClientGoogle {

	public static void main(String[] args) {
		
		Reflections reflections = new Reflections("com.patterns.factory");
		Set<Class<? extends Car>> subTypes = reflections.getSubTypesOf(Car.class);
		for (Class<? extends Car> car: subTypes) {
			try {
				Class.forName(car.getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		Car luxuryCar = CarFactory.getInstance().createProduct("Luxury");
		System.out.println(luxuryCar.carDescription());
		
		Car hatchbackCar = CarFactory.getInstance().createProduct("Hatchback");
		System.out.println(hatchbackCar.carDescription());
		
		Car sedanCar = CarFactory.getInstance().createProduct("Sedan");
		System.out.println(sedanCar.carDescription());
		
		Car benzCar = CarFactory.getInstance().createProduct("Benz");
		System.out.println(benzCar.carDescription());
		
		Car volkswagenCar = CarFactory.getInstance().createProduct("Volkswagen");
		System.out.println(volkswagenCar.carDescription());
		
	}

}
