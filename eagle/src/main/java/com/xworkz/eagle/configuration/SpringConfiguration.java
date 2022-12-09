package com.xworkz.eagle.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.eagle")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Spring configuration is configured");
	}

}
