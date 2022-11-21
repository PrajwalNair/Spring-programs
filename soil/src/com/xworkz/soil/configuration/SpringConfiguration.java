package com.xworkz.soil.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.soil.entity.SoilEntity;

@Configuration
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("running spring configuration");

	}

	@Bean
	public SoilEntity soilEntity() {
		SoilEntity entity = new SoilEntity();
		System.out.println("SoilEntity method is running");
		return entity;
	}

}
