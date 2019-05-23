package com.spring.config.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WolfConfig.class)
public class FoxConfig {

	@Bean
	public Fox getFox()
	{
		Fox f = new Fox();
		f.setColor("sdfghjk");
		f.setName("zxcvbn");
		return f;
	}
}
