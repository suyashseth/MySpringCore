package com.spring.config.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PersonConfig.class);

		//		Person  p = ctx.getBean(Person.class);
		//		p.getJob().doJob();
		//		ctx.close();
		String []names = ctx.getBeanDefinitionNames();

		for(String name:names)
		{
			System.out.println(name);
		}


	}
}
