package com.regularObjectsCreationProcess;

public class Product1 
{
	
	private int id;
	private String name;
	private double price;
	
	
	public Product1() {
		// TODO Auto-generated constructor stub
	}


	public Product1(int id, String name, double price) {
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
