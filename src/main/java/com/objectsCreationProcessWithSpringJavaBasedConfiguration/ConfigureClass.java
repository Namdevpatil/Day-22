package com.objectsCreationProcessWithSpringJavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureClass 
{
	
	@Bean(name = "product1")
	public Product getProduct1()
	{
		return new Product();
	}
	
	@Bean(name = "product2")
	public Product getProduct2()
	{
		return new Product();
	}
	
}
