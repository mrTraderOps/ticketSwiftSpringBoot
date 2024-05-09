package com.ticketReservation.services;

import java.util.List;

import com.ticketReservation.models.pricesModel;

public interface priceBusinessServiceInterface {
	
	public void test();
	
	public void init();
	
	public void destroy();
		
	public pricesModel getById (long id);
	
	public List<pricesModel> getPrices();
	
	public List<pricesModel> searchPrices(String searchTerm);
	
	public long addOne(pricesModel newPrice);
	
	public boolean deleteOne(long id);
	
	public pricesModel updateOne(long idToUpdate, pricesModel updatePrice);

}