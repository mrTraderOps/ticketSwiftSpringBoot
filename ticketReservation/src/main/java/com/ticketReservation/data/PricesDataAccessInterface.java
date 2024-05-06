package com.ticketReservation.data;

import java.util.List;

import com.ticketReservation.models.priceModel;

public interface PricesDataAccessInterface {
	
	public priceModel getByPrice (long price);
	
	public List<priceModel> getPrices();
	
	public List<priceModel> searchPrices(String searchTerm);
	
	public long addOne(priceModel newPrice);
	
	public boolean deleteOne(long price);
	
	public priceModel updateOne(long priceToUpdate, priceModel updatePrice);
	
}
