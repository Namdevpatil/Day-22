package com.objectsCreationProcessWithSpring;

public class Product 
{
	
	private int id;
	private String name;
	private double price;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
		

}
