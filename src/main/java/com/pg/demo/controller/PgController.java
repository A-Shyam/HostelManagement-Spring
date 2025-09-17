package com.pg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.pg.demo.entity.Pg;
import com.pg.demo.repository.PgRepo;

@Controller
public class PgController {
	@Autowired
	PgRepo repository;
	
	@GetMapping("/")
	public String loadMain() {
		return "home.html";
	}
	
	@GetMapping("/add-details")
	public String loadDetails() {
		return "add.html";
	}
	
	@PostMapping("/add-details")
	public String addDetails(@ModelAttribute Pg pg, ModelMap map) {
		repository.save(pg);
		map.put("message", "Record added successfully");
		return "home.html";
	}
	
	@GetMapping("/view-details")
	public String viewDetails(ModelMap map) {
		List<Pg> details=repository.findAll();
		map.put("details", details);
		return "display.html";
	}
	
	@GetMapping("/delete")
	public String deleteDetails(@RequestParam Long id, ModelMap map) {
		repository.deleteById(id);
		map.put("message", "Data deleted successfully");
		return viewDetails(map);
	}
	
	@GetMapping("/edit")
	public String editDetails(@RequestParam Long id,ModelMap map) {
		Pg pg=repository.findById(id).orElseThrow();
		map.put("pg", pg);
		return "edit.html";
	}
	
	@PostMapping("/update-details")
	public String updateDetails(@ModelAttribute Pg pg,ModelMap map) {
		repository.save(pg);
		map.put("message", "Pg Data Updated Successfully");
		return viewDetails(map);
	}
	
	
}
