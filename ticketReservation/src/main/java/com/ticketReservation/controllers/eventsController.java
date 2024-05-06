package com.ticketReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.services.DetailsBusinessServiceInterface;

@Controller
@RequestMapping("/events")
public class eventsController {
	

	DetailsBusinessServiceInterface service;
	

	public eventsController(DetailsBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("")
	public String events(Model model) {
		
		model.addAttribute("publicViewModel", new eventdetailsModel());
		
		return "index.html";
	}
	
	@GetMapping("/AuroraFest")
	public String auroraFest(Model model) {
		
		List<eventdetailsModel> details = service.getAuFest();
		
		model.addAttribute("AuroraFest", new eventdetailsModel());
		model.addAttribute("details", details);
		
		return "auroraFest.html";
	}
	
	@GetMapping("/DecemberAvenue")
	public String decAve(Model model) {
		
		List<eventdetailsModel> details = service.getDecAve();
		
		model.addAttribute("AuroraFest", new eventdetailsModel());
		model.addAttribute("details", details);
		
		return "decAve.html";
	}
}	


	

