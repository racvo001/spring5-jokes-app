package com.rachit.joke;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class Spring5JokesAppApplication {

	
	 @Bean public InternalResourceViewResolver getViewResolver() {
	 InternalResourceViewResolver viewResolver = new
	 InternalResourceViewResolver(); viewResolver.setPrefix("/WEB-INF/views/");
	 viewResolver.setSuffix(".jsp"); return viewResolver; }
	 

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppApplication.class, args);
	}

}
