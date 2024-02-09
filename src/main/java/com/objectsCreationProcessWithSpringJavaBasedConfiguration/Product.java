package com.objectsCreationProcessWithSpringJavaBasedConfiguration;

public class Product 
{
	
	private int id;
	private String name;
	private double price;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
		

}
