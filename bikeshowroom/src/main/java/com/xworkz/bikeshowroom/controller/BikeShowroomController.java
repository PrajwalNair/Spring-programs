package com.xworkz.bikeshowroom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bikeshowroom.dto.BikeShowroomDTO;
import com.xworkz.bikeshowroom.service.BikeShowroomService;

@Component
@RequestMapping("/send")
public class BikeShowroomController {
	@Autowired
	private BikeShowroomService service;

	public BikeShowroomController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(BikeShowroomDTO dto, HttpServletRequest request) {
		System.out.println("executing on send method");
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			request.setAttribute("msg", "saved successfully");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "data not saved please check the data");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
