package com.spring.config.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TigerTest {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext("TigerConfig.xml");
	Tiger t = ctx.getBean(Tiger.class);
	System.out.println(t);
	
}
}
