package com.ticketReservation.services;

import java.util.List;

import com.ticketReservation.models.priceModel;

public interface priceBusinessServiceInterface {
	
	public void test();
	
	public List<priceModel> getPrices(String eventID);
		
	// future methods
	
	// searchDetails (String searchTerm)
	
	// addDetails (priceModel new0)
	
	// deletePrice (String location)
	
	// updatePrice (OrderModel updateTerm)
	
	// getOnePrice (String location) 

}
