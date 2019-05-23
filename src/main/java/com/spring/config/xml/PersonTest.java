package com.spring.config.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("PersonConfig.xml");
		
		/*
		 * Person p = ctx.getBean(Person.class);
		 * 
		 * p.getJob().doJob();
		 */
		String []names = ctx.getBeanDefinitionNames();
		
		for(String name:names)
		{
			System.out.println(name);
		}
		
		
		
		
		ctx.close();
		
		
		
		
		
		
		
		
		
	}
}
