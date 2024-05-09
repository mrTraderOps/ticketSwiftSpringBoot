package com.ticketReservation.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ticketReservation.models.userModel;
import com.ticketReservation.models.usernameSearchModel;
import com.ticketReservation.services.userBusinessServiceInterface;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes({"username","status"})
@RequestMapping("/TicketSwift/login")
public class loginController
{
	
	userBusinessServiceInterface service;

	@Autowired
	public loginController(userBusinessServiceInterface service) {
	    this.service = service;
	}

	
	
	@GetMapping("")
	public String displayLoginForm(Model model, HttpSession session) {
		
		session.removeAttribute("username");
	    session.removeAttribute("status");
	    
		session.invalidate();
		
		model.addAttribute("user", new userModel());
		
		return "loginForm.html";
	}
	
	@GetMapping("/signup")
	public String publicViewForm(Model model) {
		
		model.addAttribute("user", new userModel());
		
		return "createAccount.html";
	}
	
	@PostMapping("/addingNewUser")
    public String addUser(@Validated userModel newUser, BindingResult bindingResult, Model model) {
		
		service.addOne(newUser);
		
		model.addAttribute("user", new userModel());
		
		return "redirect:/TicketSwift/login";
    }
	
	@PostMapping("/logging-in")
    public String login(@Validated usernameSearchModel user, BindingResult bindingResult, Model model, HttpSession session) {
		 
		if (bindingResult.hasErrors()) {
		    // handle errors
		    return "loginForm.html";
		}
		
		model.addAttribute("user", new usernameSearchModel());
		
		String searchUsername = user.getUsername();
		String searchPass = user.getPassword();
		String status = "Logout";
		
		List<userModel> username = service.getUser(searchUsername, searchPass);
		
		
		if (username.size() > 0 ) {
			
			model.addAttribute("status", status);
			model.addAttribute("username", searchUsername);
			return "redirect:/events";
			
		} else {
			
			session.removeAttribute("username");
		    session.removeAttribute("status");
		    
			session.invalidate();
			
			model.addAttribute("invalidAccount", true);
			return "loginForm.html";
		}
    }
}
