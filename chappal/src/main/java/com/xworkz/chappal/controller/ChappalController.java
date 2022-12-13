package com.xworkz.chappal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.chappal.entity.ChappalEntity;
import com.xworkz.chappal.service.ChappalService;

@Component
@RequestMapping("/send")
public class ChappalController {
	@Autowired
	private ChappalService service;

	public ChappalController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onClick(ChappalEntity entity, HttpServletRequest request) {
		System.out.println("executed");
		boolean validateAndSave = service.validateAndSave(entity);
		if (validateAndSave) {
			request.setAttribute("message", "page is successfully saved");
			System.out.println(entity);
		} else {
			request.setAttribute("error", "page is not saved,please enter the valid data");
			request.setAttribute("entity", entity);
		}
		return "index.jsp";
	}

}
