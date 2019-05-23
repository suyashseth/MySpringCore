package com.spring.config.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig {

	@Bean
	public Person getPerson(@Qualifier("test")Job j)
	{
		Person p = new Person();
		p.setId(101);
		p.setName("Veeru");
		p.setJob(j);
		return p;
	}
	

	@Primary
	@Bean
	public Job getDeveloper()
	{
		return new SoftwareDeveloper();
	}
	
	
	@Primary
	@Bean("test")
	public Job getTester()
	{
		return new SoftwareTester();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
