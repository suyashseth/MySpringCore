package com.spring.config.autowiring;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("test")
//@Named("test")
@Primary
public class Tester implements Job{

	@Override
	public void doJob() {
		System.out.println("Test Test Test");
	}

}
