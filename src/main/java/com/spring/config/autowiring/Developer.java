package com.spring.config.autowiring;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dev")
//@Named("dev")
@Primary
public class Developer implements Job{

	@Override
	public void doJob() {
		System.out.println("Code Code Code...");
	}

}
