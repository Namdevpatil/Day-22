package com.objectsCreationProcessWithSpringJavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		//spring IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigureClass.class);
		
		Product product1 = (Product) context.getBean("product1");	
		product1.setId(100);
		product1.setName("XYZ");
		product1.setPrice(78363.34);
		
		System.out.println(product1.toString());
		
		System.out.println("================================================");
		
		Product product2 = (Product) context.getBean("product2");	
		product2.setId(320);
		product2.setName("ABC");
		product2.setPrice(66363.34);
		
		System.out.println(product2.toString());
		

	}

}
