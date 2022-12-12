package com.xworkz.bikeshowroom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;

@Component
@RequestMapping("/send")
public class BikeShowroomController {

	public BikeShowroomController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(BikeShowroomDTO dto, HttpServletRequest request) {
		System.out.println("executing on send method");
		if (dto != null) {
			request.setAttribute("msg", "saved successfully");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "data not saved please check the data");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
