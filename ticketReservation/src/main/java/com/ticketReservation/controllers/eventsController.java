package com.ticketReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.eventsModel;
import com.ticketReservation.models.priceModel;
import com.ticketReservation.services.ImageService;
import com.ticketReservation.services.priceBusinessService;
import com.ticketReservation.services.priceBusinessServiceInterface;

@Controller
@RequestMapping("/events")
public class eventsController {
	

	priceBusinessServiceInterface service;
	

	public eventsController(priceBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	@GetMapping("")
	public String events(Model model) {
		
		model.addAttribute("publicViewModel", new eventsModel());
		
		return "index.html";
	}
	
	@GetMapping("/AuroraFest")
	public String auroraFest(@RequestParam("eventID") String eventID, Model model) {
		
		List <priceModel> prices = service.getPrices(eventID);
		
		model.addAttribute("AuroraFest", new eventsModel());
		model.addAttribute("eventID", eventID);
		model.addAttribute("prices", prices);
		
		return "auroraFest.html";
	}
	
	@GetMapping("/DecemberAvenue")
	public String decAve(@RequestParam("eventID") String eventID, Model model) {
		
		List <priceModel> prices = service.getPrices(eventID);
		
		model.addAttribute("decAve", new eventsModel());
		model.addAttribute("eventID", eventID);
		model.addAttribute("prices", prices);
		
		return "decAve.html";
	}
	
	@GetMapping("/Keshi")
	public String keshi(@RequestParam("eventID") String eventID, Model model) {
		
		List <priceModel> prices = service.getPrices(eventID);
		
		model.addAttribute("keshi", new eventsModel());
		model.addAttribute("eventID", eventID);
		model.addAttribute("prices", prices);
		
		return "keshi.html";
	}
	
	@GetMapping("/Dionela")
	public String dionela(@RequestParam("eventID") String eventID, Model model) {
		
		List <priceModel> prices = service.getPrices(eventID);
		
		model.addAttribute("dionela", new eventsModel());
		model.addAttribute("eventID", eventID);
		model.addAttribute("prices", prices);
		
		return "dionela.html";
	}
	
	@GetMapping("/CircusMusicFest")
	public String circus(@RequestParam("eventID") String eventID, Model model) {
		
		List <priceModel> prices = service.getPrices(eventID);
		
		model.addAttribute("circus", new eventsModel());
		model.addAttribute("eventID", eventID);
		model.addAttribute("prices", prices);
		
		
		return "circus.html";
	}
	@GetMapping("/ZackTabudlo")
	public String zacktabudlo(@RequestParam("eventID") String eventID, Model model) {
		
		List <priceModel> prices = service.getPrices(eventID);
		
		model.addAttribute("zacktabudlo", new eventsModel());
		model.addAttribute("eventID", eventID);
		model.addAttribute("prices", prices);
		
		return "zack.html";
	}
	
//	@GetMapping("/view")
//	public String publicViewForm(@RequestParam("eventID") String eventID,
//								 @RequestParam("eventName") String eventName,
//								 Model model) {
//		
//		String imageURL = imageService.getImageURLForEvent(eventID);
//		
//		List <priceModel> prices = service.getPrices(eventID);
//		List <eventdetailsModel> details = service.createEventDetails(eventID);
//
//		model.addAttribute("eventName", eventName);
//		model.addAttribute("eventID", eventID);
//		model.addAttribute("details", details);
//		model.addAttribute("prices", prices);
//		model.addAttribute("imageURL", imageURL);
//		
//		
//		return "publicView.html";
//		}
	
}

	

