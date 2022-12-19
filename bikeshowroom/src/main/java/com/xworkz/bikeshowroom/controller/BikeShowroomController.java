package com.xworkz.bikeshowroom.controller;

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
		return "index";
	}
	
	@GetMapping
	public String searchByBrand(@RequestParam String brand,Model model) {
		System.out.println("executing search by brand method");
		Optional<List<BikeShowroomDTO>> findByBrand = service.findByBrand(brand);
		if(findByBrand.isPresent() && findByBrand.get().size()>0) {
			List<BikeShowroomDTO> list = findByBrand.get();
			System.out.println(list);
			model.addAttribute("msg", "Results found");
			model.addAttribute("list", list);
			return "SearchResult";
		}else {
			model.addAttribute("msg", "No Results found");
			return "Search";
		}
		
	}

}
