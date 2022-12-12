package com.xworkz.temple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.temple.dto.TempleDTO;

@Component
@RequestMapping("/send")
public class TempleController {

	public TempleController() {
		System.out.println(getClass().getSimpleName());
	}
	
	@PostMapping
	public String onSend(TempleDTO dto,HttpServletRequest request) {
		System.out.println("Executing on send method");
		if(dto.getPincode()>0 && dto.getFees()>0 ) {
			request.setAttribute("msg", "Saved Successfully");
			System.out.println(dto);
		}else {
			request.setAttribute("error", "Please Enter the valid data");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
