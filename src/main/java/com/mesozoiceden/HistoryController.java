package com.mesozoiceden;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {
	@GetMapping("/History")
	public String getDino(Model model) {

		return "History";
	}
}
