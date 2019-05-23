package com.spring.config.mix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DragonTest {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext("DragonConfig.xml");
	
	Dragon d = ctx.getBean(Dragon.class);
	Fox f = ctx.getBean(Fox.class);
	System.out.println(d);
	System.out.println(f);
	
	
}
}
