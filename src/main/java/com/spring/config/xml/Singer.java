package com.spring.config.xml;

public class Singer implements Job{

	@Override
	public void doJob() {
		System.out.println("Singing song");
	}

	
}
