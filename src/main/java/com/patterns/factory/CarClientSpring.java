package com.patterns.factory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class CarClientSpring {

	public static void main(String[] args) {

		try(AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {}
		
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
