package com.patterns.abstractfactory;

public class SedanFactory implements GenericCarFactory {

	public Engine assembleEngine() {
		System.out.println("Assembling Sedan Engine");
		return new SedanEngine();
	}
	
	public Body assembleBody() {
		System.out.println("Assembling Sedan Body");
		return new SedanBody();
	}
}
