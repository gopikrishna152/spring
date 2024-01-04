package com.spring.spring_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
		@Bean
		Idea Idea() {
			Idea idea=new Idea(231, "khammam");
			return idea;
		} 
		
	
}
