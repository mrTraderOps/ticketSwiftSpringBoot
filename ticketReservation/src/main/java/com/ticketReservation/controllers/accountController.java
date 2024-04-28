package com.ticketReservation.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ticketReservation.models.accountModel;

@Controller
@RequestMapping("TicketSwift/account")
public class accountController
{
	@GetMapping("")
	public String displayAccountForm(Model model) {
		
		model.addAttribute("loginModel", new accountModel());
		
		return "accountProfile.html";
	}
}
