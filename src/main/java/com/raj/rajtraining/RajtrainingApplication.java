package com.raj.rajtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RajtrainingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(RajtrainingApplication.class, args);
		System.out.println("==> "+applicationContext.getBeanDefinitionCount());
		System.out.println("==> "+applicationContext.getEnvironment());

	}

}
