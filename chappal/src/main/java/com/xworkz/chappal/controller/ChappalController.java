package com.xworkz.chappal.controller;

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
		return "index";
	}
	
	@GetMapping
	public String searchByBrand(@RequestParam String brand,Model model) {
		System.out.println("search by brand method is executed");
		Optional<List<ChappalEntity>> findByBrand = service.findByBrand(brand);
		if(findByBrand.isPresent() && findByBrand.get().size()>0) {
			List<ChappalEntity> list = findByBrand.get();
			System.out.println(list);
			model.addAttribute("msg", "results found");
			model.addAttribute("list", list);
			return "SearchResult";
		}else {
			model.addAttribute("error", "No results found");
			return "Search";
		}
	}

}
