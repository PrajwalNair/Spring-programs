package com.xworkz.games.display;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.games.Games;
import com.xworkz.games.Remote;

public class Display {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Remote bean = classPathXmlApplicationContext.getBean(Remote.class);
		System.out.println(classPathXmlApplicationContext);
		System.out.println(bean);

	}

}
