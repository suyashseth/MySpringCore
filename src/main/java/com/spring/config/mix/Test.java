package com.spring.config.mix;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext(FoxConfig.class);
		Fox f = ctx.getBean(Fox.class);
		
		Wolf w = ctx.getBean(Wolf.class);
		
		System.out.println(f);
		System.out.println(w);
		
				
		
	}
}
