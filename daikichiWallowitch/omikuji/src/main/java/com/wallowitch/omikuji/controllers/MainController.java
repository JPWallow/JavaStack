package com.wallowitch.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/omikuji")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String omikujiShow(HttpSession session) {
		return "omikujiShow.jsp";
	}
	
	@PostMapping("/formSubmit")
	public String formSubmit(
			@RequestParam("number") String number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("creature") String creature,
			@RequestParam("somethingNice") String somethingNice,
			HttpSession session
			) {
			
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("creature", creature);
		session.setAttribute("somethingNice", somethingNice);
		
		return "redirect:/omikuji/show";
	}
}