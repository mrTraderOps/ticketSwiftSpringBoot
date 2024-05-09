package com.ticketReservation.services;

import java.util.List;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.userModel;
import com.ticketReservation.models.usernameSearchModel;


public interface userBusinessServiceInterface {
	
	public List<userModel> getUser(String searchUsername, String searchPassword);
	
	public long addOne(userModel newDetails);
	
	public List<userModel> getName(String searchUsername);
	
	List<userModel> searchName(String searchTerm);
	
	boolean updateOneByUsername(String username, String oldPass, String newPass);
}
