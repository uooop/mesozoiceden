package com.mesozoiceden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	Employee manager1 = new ParkManager("앨리스", 30, 8);
	Employee manager2 = new ParkManager("파우스트", 28, 6);
	
	Employee security1 = new SecurityOfficer("이스마엘", 32, 7);
	Employee security2 = new SecurityOfficer("오티스", 28, 5);
	
	Employee doctor1 = new Veterinarian("그레고르", 33, 10);
	Employee doctor2 = new Veterinarian("체자렛", 35, 10);
	
	Employee guide1 = new Guide("로쟈", 31, 4);
	Employee guide2 = new Guide("마이클", 28, 5);
	
	Employee keeper1 = new Zookeeper("아드리카", 47, 21);
	Employee keeper2 = new Zookeeper("뫼르소", 33, 3);
	
	
	@GetMapping("/Employee")
	public String getDino(Model model) {
		model.addAttribute("manager1", manager1);
		model.addAttribute("manager2", manager2);
		model.addAttribute("security1", security1);
		model.addAttribute("security2", security2);
		model.addAttribute("doctor1", doctor1);
		model.addAttribute("doctor2", doctor2);
		model.addAttribute("guide1", guide1);
		model.addAttribute("guide2", guide2);
		model.addAttribute("keeper1", keeper1);
		model.addAttribute("keeper2", keeper2);
		return "Employee";
	}
}
