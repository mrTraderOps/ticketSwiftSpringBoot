package com.ticketReservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ticketReservation.data.PricesDataAccessInterface2;
import com.ticketReservation.models.pricesModel;


public class priceBusinessService implements priceBusinessServiceInterface {
	
	@Autowired
	PricesDataAccessInterface2 pricesDAO;
	
    @Override
    public void test() {
        System.out.println("priceBusinessService is working");
    }

    @Override
    public List<pricesModel> getPrices() {
 
    	return pricesDAO.getPrices();
    }

	@Override
	public void init() {
		System.out.println("Init method of the price business service");
//		prices = new ArrayList<priceModel>();
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method of the price business service");
	}

	@Override
	public pricesModel getById(long id) {
		
		return pricesDAO.getById(id);                                                   
	}

	@Override
	public List<pricesModel> searchPrices(String searchTerm) {
		
		return pricesDAO.searchPrices(searchTerm);
	}

	@Override
	public long addOne(pricesModel newPrice) {
		
		return pricesDAO.addOne(newPrice);
	}

	@Override
	public boolean deleteOne(long id) {
		
		return pricesDAO.deleteOne(id);
	}

	@Override
	public pricesModel updateOne(long idToUpdate, pricesModel updatePrice) {
		
		return pricesDAO.updateOne(idToUpdate, updatePrice);
	}
}
