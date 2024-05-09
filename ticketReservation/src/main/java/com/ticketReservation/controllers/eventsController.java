package com.ticketReservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.userModel;
import com.ticketReservation.services.DetailsBusinessServiceInterface;
import com.ticketReservation.services.userBusinessServiceInterface;

import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/events")
public class eventsController {
	
	
	DetailsBusinessServiceInterface service;
	userBusinessServiceInterface service1;
	
	@Autowired
	public eventsController(DetailsBusinessServiceInterface service,userBusinessServiceInterface service1 ){
		super();
		this.service = service;
		this.service1 = service1;
	}

	@GetMapping("")
	public String events(Model model,HttpSession session) {
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        
	        if (username != null && status != null) {
	            List<userModel> usermodel = service1.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	            return "index.html";
	        }
	    }
		model.addAttribute("status", "Login");
		
		return "index.html";
	}
	
	@GetMapping("/AuroraFest")
	public String auroraFest(Model model, HttpSession session) {
		
		List<eventdetailsModel> details = service.getAuFest();
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        
	        if (username != null && status != null) {
	            List<userModel> usermodel = service1.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	    		model.addAttribute("details", details);

	            return "auroraFest2.html";
	        }
	    }
		
		
		model.addAttribute("details", details);
		model.addAttribute("status", "Login");
		return "auroraFest.html";
	}
	
	@GetMapping("/DecemberAvenue")
	public String decAve(Model model, HttpSession session) {
		
		List<eventdetailsModel> details = service.getDecAve();
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        
	        if (username != null && status != null) {
	            List<userModel> usermodel = service1.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	            model.addAttribute("details", details);
	            
	            return "decAve2.html";
	        }
	    }
		
		model.addAttribute("details", details);
		model.addAttribute("status", "Login");
		return "decAve.html";
	}
	
	@GetMapping("/KeshiConcertTour")
	public String keshi(Model model, HttpSession session) {
		
		List<eventdetailsModel> details = service.getKeshi();
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        
	        if (username != null && status != null) {
	            List<userModel> usermodel = service1.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	    		model.addAttribute("details", details);

	            return "keshi2.html";
	        }
	    }
		
		
		model.addAttribute("details", details);
		model.addAttribute("status", "Login");
		return "keshi.html";
	}
	
	@GetMapping("/DionelaConcert")
	public String Dionela(Model model, HttpSession session) {
		
		List<eventdetailsModel> details = service.getDion();
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        
	        if (username != null && status != null) {
	            List<userModel> usermodel = service1.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	    		model.addAttribute("details", details);

	            return "dionela2.html";
	        }
	    }
		
		
		model.addAttribute("details", details);
		model.addAttribute("status", "Login");
		return "dionela.html";
	}
	
	@GetMapping("/CircusMusicFest")
	public String Circus(Model model, HttpSession session) {
		
List<eventdetailsModel> details = service.getCircus();
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        
	        if (username != null && status != null) {
	            List<userModel> usermodel = service1.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	    		model.addAttribute("details", details);

	            return "circus2.html";
	        }
	    }
		
		
		model.addAttribute("details", details);
		model.addAttribute("status", "Login");
		return "circus.html";
	}
	
	@GetMapping("/ZackConcertTour")
	public String Zack(Model model, HttpSession session) {
		
		List<eventdetailsModel> details = service.getZack();
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        
	        if (username != null && status != null) {
	            List<userModel> usermodel = service1.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	    		model.addAttribute("details", details);

	            return "zack2.html";
	        }
	    }
		
		
		model.addAttribute("details", details);
		model.addAttribute("status", "Login");
		return "zack.html";
	}
}	


	

