package com.xworkz.busstand.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.busstand.dto.BusStandDTO;

@Component
@RequestMapping("/send")
public class BusStandController {

	public BusStandController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(BusStandDTO dto, HttpServletRequest request) {
		System.out.println("executing the on send method");
		if (dto.getNoOfShop() >= 0 && dto.getNoOfBusses() >= 0 && dto.getNoOfPlatform() >= 0) {
			System.out.println(dto);
			request.setAttribute("msg", "Saved Successfully");
		} else {
			request.setAttribute("error", "you have entered the invalid data");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
