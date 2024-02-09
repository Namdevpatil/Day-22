package com.objectsAsseblingProcessInSpringJavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureClass 
{
	
	@Bean(name = "product2")
	public Product getProduct()
	{
		return new Product();
	}
	
	@Bean(name = "brand2")
	public Brand getBrand()
	{
		return new Brand();
	}
	
}
