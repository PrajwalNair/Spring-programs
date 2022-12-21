package com.xworkz.patient.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.patient.dto.PatientDTO;
import com.xworkz.patient.service.PatientService;

@Component
@RequestMapping("/send")
public class PatientController {
	@Autowired
	private PatientService service;

	public PatientController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(PatientDTO dto, Model model) {
		System.out.println("on send method is running");
		boolean findByEmail = service.findByEmail(dto.getEmail());
		boolean findByMobileNo = service.findByMobileNo(dto.getMobileNo());
		if (!findByEmail) {
			System.out.println(dto.getEmail());
			model.addAttribute("error", "Email already exists");
			return "index";
		} else if (!findByMobileNo) {
			System.out.println(dto.getMobileNo());
			model.addAttribute("error", "mobile number already exists");
			return "index";
		} else {
			boolean validateAndSave = service.validateAndSave(dto);
			if (validateAndSave) {
				System.out.println("Data is saved" + dto);
				model.addAttribute("msg", "Details saved successfully");
				model.addAttribute("dto", dto);
				return "Success";
			} else {
				System.out.println("Data is not saved");
				model.addAttribute("error", "Details not valid");
				return "index";
			}
		}

	}

	@GetMapping
	public String onSearch(@RequestParam String name, Model model, int age) {
		System.out.println("on search method for is running");
		Optional<List<PatientDTO>> findByName = service.findByName(name);
		Optional<List<PatientDTO>> findByAgeGreaterThan = service.findByAgeGreaterThan(age);
		if (findByName.isPresent() && findByName.get().size() > 0) {
			List<PatientDTO> list = findByName.get();
			System.out.println(list);
			model.addAttribute("list", list);
			return "Search";
		}

		else if (findByAgeGreaterThan.isPresent() && findByAgeGreaterThan.get().size() > 0) {
			List<PatientDTO> list = findByAgeGreaterThan.get();
			System.out.println(list);
			model.addAttribute("list", list);
			return "Search";
		} else {
			model.addAttribute("error", "No result");
			return "Search";
		}

	}

}
