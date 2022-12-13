package com.xworkz.oyo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.oyo.dto.OyoDTO;
import com.xworkz.oyo.service.OyoService;

@Component
@RequestMapping("/send")
public class OyoController {
	@Autowired
	private OyoService service;

	public OyoController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(OyoDTO dto, HttpServletRequest request) {
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			System.out.println("on send method is executing");
			request.setAttribute("msg", "Saved successfully");
			System.out.println(dto);

		} else {
			request.setAttribute("error", "data not saved please check the data");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
