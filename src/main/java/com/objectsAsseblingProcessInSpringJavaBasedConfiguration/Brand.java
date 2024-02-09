package com.objectsAsseblingProcessInSpringJavaBasedConfiguration;

public class Brand 
{
	
	private String brand;
	
	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public Brand(String brand) 
	{
		this.brand = brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() 
	{
		return "Brand [brand=" + brand + "]";
	}	

}
