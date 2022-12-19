package com.xworkz.oyo.controller;

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
		return "index";
	}

	@GetMapping
	public String searchByLocation(@RequestParam String location, Model model) {
		System.out.println("search by location method is executing");
		Optional<List<OyoDTO>> findByLocation = service.findByLocation(location);
		if (findByLocation.isPresent() && findByLocation.get().size() > 0) {
			List<OyoDTO> list = findByLocation.get();
			System.out.println(list);
			model.addAttribute("msg", "Results found");
			model.addAttribute("list", list);
			return "SearchResult";
		} else {
			model.addAttribute("error", "No Results found");
			return "Search";
		}
	}

}
