package com.patterns.factory;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Arun_Subramonian
 * CarFactory using Singleton pattern
 *
 */

public class CarFactory {

	private static CarFactory carFactory;
	private static Map<String,Car> m_RegisteredProducts;
	
	private static Map<String, Car> getmRegisteredproducts() {
		if (m_RegisteredProducts == null)
			m_RegisteredProducts = new HashMap<String, Car>();
		
		return m_RegisteredProducts;
	}

	private CarFactory() {	}

	public static CarFactory getInstance()
	{
		if (carFactory == null)
			carFactory = new CarFactory();

		return carFactory;
	}
	

	public void registerProduct(String carType, Car p)    {
		getmRegisteredproducts().put(carType, p);
	}

	public Car createProduct(String carType){
		return ((Car)getmRegisteredproducts().get(carType)).createProduct();
	}
	
}
