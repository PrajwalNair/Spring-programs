package com.xworkz.country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.country.beans.Country;
import com.xworkz.country.configuration.SpringConfiguration;

public class SpringBoot {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Country bean = applicationContext.getBean(Country.class);
		System.out.println(bean);
		
	}
	

}
