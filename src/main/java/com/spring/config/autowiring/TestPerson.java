package com.spring.config.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PersonConfig.class);

		String []names = ctx.getBeanDefinitionNames();

		for(String name:names)
		{
			System.out.println(name);
		}
	}
}
