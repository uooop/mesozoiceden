package com.mesozoiceden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpinosaurusController {
	Dinosaur spino1 = new Spinosaurus("Jack", 15, 2000.0, "Carnivore", "스피노사우루스");
    Dinosaur spino2 = new Spinosaurus("Luna", 13, 1800.0, "Carnivore", "스피노사우루스");
    Dinosaur spino3 = new Spinosaurus("Bruno", 17, 2200.0, "Carnivore", "스피노사우루스");
    Dinosaur spino4 = new Spinosaurus("Roxy", 10, 1500.0, "Carnivore", "스피노사우루스");
	
	@GetMapping("/Spinosaurus")
	public String getDino(Model model) {
		model.addAttribute("spino1", spino1);
		model.addAttribute("spino2", spino2);
		model.addAttribute("spino3", spino3);
		model.addAttribute("spino4", spino4);
		return "Spinosaurus";
	}
}
