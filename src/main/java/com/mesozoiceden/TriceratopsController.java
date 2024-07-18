package com.mesozoiceden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TriceratopsController {
	Dinosaur trice1 = new Triceratops("Spike", 8, 500.0, "Herbivore", "트리케라톱스");
    Dinosaur trice2 = new Triceratops("Rose", 7, 480.0, "Herbivore", "트리케라톱스");
    Dinosaur trice3 = new Triceratops("Rocky", 4, 300.0, "Herbivore", "트리케라톱스");
    Dinosaur trice4 = new Triceratops("Rex", 12, 700.0, "Herbivore", "트리케라톱스");
	
	@GetMapping("/Triceratops")
	public String getDino(Model model) {
		model.addAttribute("trice1", trice1);
		model.addAttribute("trice2", trice2);
		model.addAttribute("trice3", trice3);
		model.addAttribute("trice4", trice4);
		return "Triceratops";
	}
}
