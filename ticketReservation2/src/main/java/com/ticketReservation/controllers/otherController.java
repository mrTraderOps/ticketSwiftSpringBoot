package com.ticketReservation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class otherController {
	
	@GetMapping("/generic")
	public String generic()
	{
		return "generic.html";
	}
	@GetMapping("/elements")
	public String elements()
	{
		return "elements.html";
	}
	@GetMapping("/TicketSwift")
	public String ticketswift()
	{
		return "firstPage.html";
	}
}
