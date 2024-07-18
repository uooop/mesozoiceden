package com.mesozoiceden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MosasaurusController {
	Dinosaur mosa1 = new Mosasaurus("Tom", 10, 500.0, "Seafood", "모사사우루스");
	Dinosaur mosa2 = new Mosasaurus("Lily", 8, 480.0, "Seafood", "모사사우루스");
	Dinosaur mosa3 = new Mosasaurus("Max", 12, 550.0, "Seafood", "모사사우루스");
	Dinosaur mosa4 = new Mosasaurus("Daisy", 5, 300.0, "Seafood", "모사사우루스");
	
	@GetMapping("/Mosasaurus")
	public String getDino(Model model) {
		model.addAttribute("mosa1", mosa1);
		model.addAttribute("mosa2", mosa2);
		model.addAttribute("mosa3", mosa3);
		model.addAttribute("mosa4", mosa4);
		return "Mosasaurus";
	}
}