package com.patterns.abstractfactory;

import com.patterns.abstractfactory.*;

public class Main {

	public static void assembleCar(GenericCarFactory carFactory) {
		Engine engine = carFactory.assembleEngine();
		Body body = carFactory.assembleBody();
		if (carFactory instanceof HatchbackFactory) {
			System.out.println("Making my Hatchback car!!!");
		} else if (carFactory instanceof SedanFactory) {
			System.out.println("Making my Sedan car!!!");
		}		
		body.paintBody();
		engine.startEngine();
	}
	
	public static void main(String[] args) {
		
		//Making a Hatchback
		assembleCar(new HatchbackFactory());
		
		//Making a Sedan
		assembleCar(new SedanFactory());

	}

}
