package com.mesozoiceden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PteranodonController {
	Dinosaur ptera1 = new Pteranodon("Alex", 5, 20.0, "Carnivore", "프테라노돈");
    Dinosaur ptera2 = new Pteranodon("Sophie", 3, 18.0, "Carnivore", "프테라노돈");
    Dinosaur ptera3 = new Pteranodon("Victor", 6, 25.0, "Carnivore", "프테라노돈");
    Dinosaur ptera4 = new Pteranodon("Ava", 4, 22.0, "Carnivore", "프테라노돈");
	
	@GetMapping("/Pteranodon")
	public String getDino(Model model) {
		model.addAttribute("ptera1", ptera1);
		model.addAttribute("ptera2", ptera2);
		model.addAttribute("ptera3", ptera3);
		model.addAttribute("ptera4", ptera4);
		return "Pteranodon";
	}
}
