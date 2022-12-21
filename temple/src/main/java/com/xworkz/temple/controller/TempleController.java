package com.xworkz.temple.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.service.TempleService;

@Component
@RequestMapping("/send")
public class TempleController {
	@Autowired
	private TempleService service;

	public TempleController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(TempleDTO dto, HttpServletRequest request) {
		System.out.println("Executing on send method");
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			request.setAttribute("msg", "Saved Successfully");
			System.out.println(dto);
		} else {
			request.setAttribute("error", "Please Enter the valid data");
			request.setAttribute("dto", dto);
		}
		return "index";
	}

	@GetMapping
	public String searchByGod(@RequestParam String mainGod, Model model) {
		Optional<List<TempleDTO>> findByGod = service.findByGod(mainGod);
		if (findByGod.isPresent() && findByGod.get().size()>0) {
			List<TempleDTO> list = findByGod.get();
			System.out.println(list);
			model.addAttribute("msg", "results found");
			model.addAttribute("dto", list);
			return "SearchGod.jsp";
		} else {
			System.out.println("No results found");
			model.addAttribute("error", "No results found");
			return "Search";
		}

	}

}
