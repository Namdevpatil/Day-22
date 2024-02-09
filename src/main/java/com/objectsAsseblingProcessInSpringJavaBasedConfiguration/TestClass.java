package com.objectsAsseblingProcessInSpringJavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestClass {

	public static void main(String[] args) {
		
		//spring IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureClass.class);
		
		Brand brand = (Brand) context.getBean("brand2");
		brand.setBrand("ABC");
		
		Product product1 = (Product) context.getBean("product2");
		product1.setId(330);
		product1.setName("XYZ");
		product1.setBrand(brand);
		product1.setPrice(87448.34);
		
		System.out.println(product1.getProduct());
		
		

	}

}
