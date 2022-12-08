package com.xworkz.flash.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	public SpringConfig() {
		System.out.println("Spring is configuring");
	}

}
