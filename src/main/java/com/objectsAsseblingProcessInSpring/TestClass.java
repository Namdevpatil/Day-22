package com.objectsAsseblingProcessInSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClass {

	public static void main(String[] args) {
		
		//spring IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		
		Product product1 = (Product) context.getBean("product2");	
		
		System.out.println(product1.getProduct());
		
		

	}

}
