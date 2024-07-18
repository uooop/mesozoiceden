package com.mesozoiceden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TyrannosaurusController {
	Dinosaur tino1 = new Tyrannosaurus("Terry", 20, 8000.0, "Carnivore", "티라노사우루스");
    Dinosaur tino2 = new Tyrannosaurus("Sally", 18, 7500.0, "Carnivore", "티라노사우루스");
    Dinosaur tino3 = new Tyrannosaurus("Buster", 6, 1500.0, "Carnivore", "티라노사우루스");
    Dinosaur tino4 = new Tyrannosaurus("Lucy", 25, 9000.0, "Carnivore", "티라노사우루스");
	
	@GetMapping("/Tyrannosaurus")
	public String getDino(Model model) {
		model.addAttribute("tino1", tino1);
		model.addAttribute("tino2", tino2);
		model.addAttribute("tino3", tino3);
		model.addAttribute("tino4", tino4);
		return "Tyrannosaurus";
	}
}
