package com.patterns.abstractfactory;

public class HatchbackFactory implements GenericCarFactory {

	public Engine assembleEngine() {
		System.out.println("Assembling Hatchback Engine");
		return new HatchbackEngine();
	}
	
	public Body assembleBody() {
		System.out.println("Assembling Hatchback Body");
		return new HatchbackBody();
	}
}
