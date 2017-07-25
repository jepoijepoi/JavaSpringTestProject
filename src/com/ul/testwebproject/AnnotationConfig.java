package com.ul.testwebproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
