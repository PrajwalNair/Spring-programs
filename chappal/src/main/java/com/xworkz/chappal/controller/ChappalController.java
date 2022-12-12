package com.xworkz.chappal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.chappal.entity.ChappalEntity;

@Component
@RequestMapping("/send")
public class ChappalController {

	public ChappalController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onClick(ChappalEntity entity,HttpServletRequest request ) {
		System.out.println("executed");
		if (entity.getPrice() > 0 && entity.getSize() > 0) {
			request.setAttribute("message", "page is successfully saved");
		} else {
			request.setAttribute("error", "page is not saved,please enter the valid data");
			request.setAttribute("entity", entity);
		}
		return "index.jsp";
	}

}
