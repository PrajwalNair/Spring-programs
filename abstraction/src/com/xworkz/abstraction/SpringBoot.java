package com.xworkz.abstraction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.abstraction.configuration.SpringConfiguration;
import com.xworkz.abstraction.service.ATMService;
import com.xworkz.abstraction.service.PendriveService;
import com.xworkz.abstraction.service.RoboService;
import com.xworkz.abstraction.service.SimService;
import com.xworkz.abstraction.service.TheatreService;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ATMService bean = context.getBean(ATMService.class);
		System.out.println(bean.validateAndSave(null));
		PendriveService bean1 = context.getBean(PendriveService.class);
		System.out.println(bean1.validateAndSave(null));
		RoboService bean2 = context.getBean(RoboService.class);
		System.out.println(bean2.validateAndSave(null));
		SimService bean3 = context.getBean(SimService.class);
		System.out.println(bean3.validateAndSave(null));
		TheatreService bean4 = context.getBean(TheatreService.class);
		System.out.println(bean4.validateAndSave(null));

	}

}
