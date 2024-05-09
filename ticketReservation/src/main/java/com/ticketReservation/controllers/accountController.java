package com.ticketReservation.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ticketReservation.models.changePassModel;
import com.ticketReservation.models.userModel;
import com.ticketReservation.models.usernameSearchModel;
import com.ticketReservation.services.DetailsBusinessServiceInterface;
import com.ticketReservation.services.userBusinessServiceInterface;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/TicketSwift")
public class accountController {
	
	userBusinessServiceInterface service;
	
	public accountController(userBusinessServiceInterface service ){
		super();
		this.service = service;
	}
	
	@GetMapping("/account")
	public String generic(Model model, HttpSession session){
		
		if (session != null) {
	        String username = (String) session.getAttribute("username");
	        String status = (String) session.getAttribute("status");
	        if (username != null) {
	        	
	            List<userModel> usermodel = service.searchName(username);
	            model.addAttribute("status", status);
	            model.addAttribute("usermodel", usermodel);
	            
	    		model.addAttribute("changepass", new changePassModel());
	            return "accountProfile.html";
	        }
		}
		model.addAttribute("changepass", new changePassModel());
		model.addAttribute("status", "Login");
		return "accountProfile2.html";
	}
	
	@PostMapping("/changingPassword")
	public String generic(@Validated changePassModel change, BindingResult bindingResult, HttpSession session, Model model){
	    
		String username = (String) session.getAttribute("username");
        String status = (String) session.getAttribute("status");

		
	    model.addAttribute("changepass", new changePassModel());
	    
	    if (bindingResult.hasErrors()) {
	        // handle errors
	        return "";
	    }
	    
	    String oldPass = change.getPass1();
	    String newPass = change.getPass2();
	    
	    // Attempt to update password
	    boolean passwordUpdated = service.updateOneByUsername(username, oldPass, newPass);
	    
	    if (!passwordUpdated) {
	    	
	    	List<userModel> usermodel = service.searchName(username);
            model.addAttribute("status", status );
            model.addAttribute("usermodel", usermodel);
	        model.addAttribute("updateFailed", true);
	        return "accountProfile.html";
	    }
	    
	    // Password updated successfully, return success view
	    return "redirect:/TicketSwift/account";
	}

	
}
