package com.xworkz.soil.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soil.configuration.SpringConfiguration;
import com.xworkz.soil.entity.SoilEntity;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SoilEntity bean = context.getBean(SoilEntity.class);
		bean.produceFood();
		
	}

}
