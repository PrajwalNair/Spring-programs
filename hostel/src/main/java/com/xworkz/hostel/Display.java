package com.xworkz.hostel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hostel.dto.HostelDTO;
import com.xworkz.hostel.dto.PgDTO;
import com.xworkz.hostel.dto.RoomDTO;

public class Display {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(context);
		RoomDTO bean = context.getBean(RoomDTO.class);
		System.out.println(bean);
	}

}
