package com.xworkz.eagle.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/send")
public class IceCreamController {

	public IceCreamController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend() {
		System.out.println("executing");
		return "index.jsp";
	}

}
