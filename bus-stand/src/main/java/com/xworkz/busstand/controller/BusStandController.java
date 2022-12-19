package com.xworkz.busstand.controller;

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

import com.xworkz.busstand.dto.BusStandDTO;
import com.xworkz.busstand.service.BusStandService;

@Component
@RequestMapping("/send")
public class BusStandController {
	@Autowired
	private BusStandService service;

	public BusStandController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(BusStandDTO dto, HttpServletRequest request) {
		System.out.println("executing the on send method");
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			System.out.println(dto);
			request.setAttribute("msg", "Saved Successfully");
		} else {
			request.setAttribute("error", "you have entered the invalid data");
			request.setAttribute("dto", dto);
		}
		return "index";
	}
	
	@GetMapping
	public String searchByName(@RequestParam String name,Model model) {
		System.out.println("executing search by name method");
		Optional<List<BusStandDTO>> findByName = service.findByName(name);
		if(findByName.isPresent() && findByName.get().size()>0) {
			List<BusStandDTO> list = findByName.get();
			System.out.println(list);
			model.addAttribute("msg", "Results found");
			model.addAttribute("list", list);
			return "SearchResult";
		}else {
			model.addAttribute("error", "No Results found");
			return "Search";
		}
	}

}
