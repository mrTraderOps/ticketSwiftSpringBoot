package com.ticketReservation.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import com.ticketReservation.data.userDataAccessInterface;
import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.userModel;
import com.ticketReservation.models.usernameSearchModel;

public class userBusinessService implements userBusinessServiceInterface {

	
	@Autowired
	userDataAccessInterface<userModel> userDAO;
	
	@Override
	public long addOne(userModel newDetails) {
		// TODO Auto-generated method stub
		return userDAO.addOne(newDetails );
	}

	@Override
	public List<userModel> getUser(String searchUsername, String searchPassword) {
		// TODO Auto-generated method stub
		return userDAO.getUser(searchUsername, searchPassword);
	}

	@Override
	public List<userModel> getName(String searchUsername) {
		// TODO Auto-generated method stub
		return userDAO.getName(searchUsername);
	}

	@Override
	public List<userModel> searchName(String searchTerm) {
		// TODO Auto-generated method stub
		return userDAO.searchName(searchTerm);
	}

	@Override
	public boolean updateOneByUsername(String username, String oldPass, String newPass) {
		// TODO Auto-generated method stub
		return userDAO.updateOneByUsername(username, oldPass, newPass);
	}

}
