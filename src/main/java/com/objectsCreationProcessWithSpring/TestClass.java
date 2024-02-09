package com.objectsCreationProcessWithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.regularObjectsCreationProcess.Product1;

public class TestClass {

	public static void main(String[] args) {
		
		//spring IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Product product1 = (Product) context.getBean("product1");	
		
		System.out.println(product1.toString());
		
		System.out.println("===========================================");
		
		Product product2 = (Product) context.getBean("product2");	
		
		System.out.println(product2.toString());

	}

}
