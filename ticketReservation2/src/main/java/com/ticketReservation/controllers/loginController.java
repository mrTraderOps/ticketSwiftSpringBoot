package com.ticketReservation.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticketReservation.models.loginModel;

@Controller
@RequestMapping("/TicketSwift/login")
public class loginController
{
	@GetMapping("")
	public String displayLoginForm(Model model) {
		
		model.addAttribute("loginModel", new loginModel());
		
		return "loginForm.html";
	}
	
	@GetMapping("/signup")
	public String publicViewForm(Model model) {
		
		return "createAccount.html";
	}
}
