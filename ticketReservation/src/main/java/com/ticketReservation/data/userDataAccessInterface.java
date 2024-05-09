package com.ticketReservation.data;

import java.util.List;

import com.ticketReservation.models.userModel;
import com.ticketReservation.models.usernameSearchModel;

public interface userDataAccessInterface<T> {
	
	public long addOne(T newDetails);
	
	public List<T> getUser(String searchUsername, String searchPassword);

	public List<T> getName(String searchUsername);

	List<T> searchName(String searchTerm);

	boolean updateOneByUsername(String username, String oldPass, String newPass);

}
