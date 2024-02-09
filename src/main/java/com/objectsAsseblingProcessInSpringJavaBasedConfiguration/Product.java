package com.objectsAsseblingProcessInSpringJavaBasedConfiguration;

public class Product 
{
	
	private int id;
	private String name;
	private Brand brand;//assembling Brand to Product
	private double price;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, Brand brand, double price) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getProduct() 
	{
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
