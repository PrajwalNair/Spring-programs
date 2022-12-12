package com.xworkz.oyo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.oyo.dto.OyoDTO;

@Component
@RequestMapping("/send")
public class OyoController {
	public OyoController() {
		System.out.println(getClass().getSimpleName());
	}
	
	@PostMapping
	public String onSend(OyoDTO dto,HttpServletRequest request) {
		if(dto.getFees()>0 && dto.getAge()>0 && dto.getPincode()>0 && dto.getContactNo()>0 && dto.getNoOfRooms()>0) {
			System.out.println("on send method is executing");
			request.setAttribute("msg", "Saved successfully");
			System.out.println(dto);
			
		}else {
			request.setAttribute("error", "data not saved please check the data");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
