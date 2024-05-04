package com.ticketReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.eventsModel;
import com.ticketReservation.models.priceModel;
import com.ticketReservation.services.ImageService;
import com.ticketReservation.services.priceBusinessService;
import com.ticketReservation.services.priceBusinessServiceInterface;

@RestController
@RequestMapping("/api/v1/prices")
public class PriceRestController {
	
	@Autowired
	priceBusinessServiceInterface service;
	

	public PriceRestController(priceBusinessServiceInterface service) {
		super();
		this.service = service;
	}

	
	@GetMapping("/")
	public String auroraFest(String eventID) {
		
		List <priceModel> prices = service.getPrices(eventID);
		
		return prices;
		
	}
}

	

