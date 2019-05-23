package com.spring.config.mix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonkeyTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("MonkeyConfig.xml");
	
		Monkey m = ctx.getBean(Monkey.class);
		
		System.out.println(m);
		
		
		
	}
}
