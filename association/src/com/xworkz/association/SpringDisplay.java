package com.xworkz.association;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.association.beans.Court;
import com.xworkz.association.beans.Hospital;
import com.xworkz.association.beans.Institute;
import com.xworkz.association.beans.Land;
import com.xworkz.association.beans.MRP;
import com.xworkz.association.beans.Temple;
import com.xworkz.association.config.SpringConfig;

public class SpringDisplay {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Court bean = context.getBean(Court.class);
		System.out.println(bean.getType());
		System.out.println(bean.getState());
		System.out.println(bean.getLocation());
		bean.display();
		
		Temple bean1 = context.getBean(Temple.class);
		System.out.println(bean1.getName());
		System.out.println(bean1.getLocation());
		System.out.println(bean1.getPincode());
		System.out.println(bean1.getGod());
		bean1.display();
		
		Hospital bean2 = context.getBean(Hospital.class);
		System.out.println(bean2.getName());
		System.out.println(bean2.getLocation());
		System.out.println(bean2.getRating());
		System.out.println(bean2.getCountry());
		bean2.display();
		
		Land bean3 = context.getBean(Land.class);
		System.out.println(bean3.getType());
		System.out.println(bean3.getArea());
		System.out.println(bean3.getCountry());
		System.out.println(bean3.getLocation());
		bean3.display();
		
		Institute bean4 = context.getBean(Institute.class);
		bean4.setLocation("hubli");
		System.out.println(bean4.getName());
		System.out.println(bean4.getSince());
		System.out.println(bean4.getRating());
		System.out.println(bean4.getLocation());
		bean4.display();
		
		MRP bean5 = context.getBean(MRP.class);
		System.out.println(bean5.getArea());
		System.out.println(bean5.getOwnerName());
		System.out.println(bean5.getOpenTime());
		System.out.println(bean5.getCloseTime());
		bean5.display();
		
	}

}
