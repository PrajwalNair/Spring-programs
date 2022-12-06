package com.xworkz.abstraction.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.abstraction.repository.ATMRepository;
import com.xworkz.abstraction.repository.ATMRepositoryImpl;
import com.xworkz.abstraction.repository.PendriveRepository;
import com.xworkz.abstraction.repository.PendriveRepositoryImpl;
import com.xworkz.abstraction.repository.RoboRepositoryImpl;
import com.xworkz.abstraction.repository.SimRepositoryImpl;
import com.xworkz.abstraction.repository.TheatreRepository;
import com.xworkz.abstraction.repository.TheatreRepositoryImpl;
import com.xworkz.abstraction.repository.RoboRepository;
import com.xworkz.abstraction.repository.SimRepository;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean
	public ATMRepository atmRepository() {
		return new ATMRepositoryImpl();
	}
	
	@Bean
	public PendriveRepository pendriveRepository() {
		return new PendriveRepositoryImpl();
	}
	
	@Bean
	public RoboRepository RoboRepository() {
		return new RoboRepositoryImpl();
	}
	
	@Bean
	public SimRepository SimRepository() {
		return new SimRepositoryImpl();
	}
	
	@Bean
	public TheatreRepository theatreRepository() {
		return new TheatreRepositoryImpl();
	}

}
