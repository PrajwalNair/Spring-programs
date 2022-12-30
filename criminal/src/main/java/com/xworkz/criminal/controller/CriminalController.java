package com.xworkz.criminal.controller;


import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.criminal.dto.CriminalDTO;
import com.xworkz.criminal.service.CriminalService;

@Controller
@RequestMapping("/criminal")
public class CriminalController {
	@Autowired
	private CriminalService service; 

	public CriminalController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping 
	public String onSend(CriminalDTO dto, Model model,@RequestParam("file") MultipartFile file) {
		System.out.println("On send method is running");
		
		try {
			byte [] bytes = file.getBytes();
			String files = System.currentTimeMillis()+"_"+file.getOriginalFilename();
			Path path = Paths.get("D://multipart-image/" + files);
			System.out.println(path);
			Files.write(path,bytes);
			dto.setFileName(files);
			long size = file.getSize();
			dto.setFileSize(size);
			String name = file.getName();
			String contentType = file.getContentType();
			dto.setContentType(contentType);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean validateAndSave = service.validateAndSave(dto);
		if (validateAndSave) {
			System.out.println("Data is valid and saved successfully");
			model.addAttribute("dto", dto);
			return "success";
		} else {
			System.out.println("Data is not valid please enter the valid data");
			return "index";
		}

	}
	
	@GetMapping
	public String onSearch(@RequestParam String name, @RequestParam String jailName,Model model) {
		System.out.println("On search method is running");
		Optional<List<CriminalDTO>> findByNameAndJailName = service.findByNameAndJailName(name, jailName);
		if(findByNameAndJailName.isPresent() && findByNameAndJailName.get().size()>0) {
			System.out.println("data is present to select");
			List<CriminalDTO> list = findByNameAndJailName.get();
			model.addAttribute("list", list);
			model.addAttribute("msg", "Results found");
			return "search";
			
		}else {
			System.out.println("data is not present to select");
			model.addAttribute("msg", "Results not found");
			return "search";
		}
		
//		Optional<List<CriminalDTO>> findByName = service.findByName(jailName);
//		if(findByName!=null && findByName.get().size()>0) {
//			System.out.println("data is present, controller");
//			List<CriminalDTO> list = findByName.get();
//			model.addAttribute("list", list);
//			model.addAttribute("msg", "Results found");
//			return "search";
//		}
//		Optional<List<CriminalDTO>> findByJailName = service.findByJailName(jailName);
//		if(findByJailName!=null && findByJailName.get().size()>0) {
//			System.out.println("data is present in find by jail method, controller");
//			List<CriminalDTO> list = findByJailName.get();
//			model.addAttribute("list", list);
//			return "search";
//		}else {
//			System.out.println("data is not present");
//			model.addAttribute("error", "Results found");
//			return "search";
//		}
	}
	
	
	@GetMapping(value = "/files/{file_name}")
	public void getFile(@PathVariable("file_name") String fileName,HttpServletResponse response) throws IOException {
		System.out.println("File name is "+fileName);

		Path path = Paths
				.get("D://multipart-image/" +fileName);
	    byte[] file = Files.readAllBytes(path);
	    File file2 = new File("D://multipart-image/"+fileName);
	    response.reset();
	    String mimeType = URLConnection.guessContentTypeFromName(file2.getName());
	    response.setContentType(mimeType); 
	    
	    try {
//	        response.getOutputStream().write(file);
	    	response.getOutputStream().write(Files.readAllBytes(file2.toPath()));
	        String contentType = response.getContentType();
	        
	        
	    } catch (IOException e) {

	    	e.printStackTrace();
	    }
	}

}
