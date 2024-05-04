package com.ticketReservation.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.priceModel;


public class priceBusinessService implements priceBusinessServiceInterface {
	
	List<priceModel> prices;
	
    @Override
    public void test() {
        System.out.println("priceBusinessService is working");
    }

    @Override
    public List<priceModel> getPrices(String eventID) {
                

        if ("01".equals(eventID)) {
            prices.add(new priceModel("VIP","April 1", "₱4,410"));
            prices.add(new priceModel("GOLD","April 1", "₱3,500"));
            prices.add(new priceModel("SILVER","April 1", "₱2,000"));
            prices.add(new priceModel("REGULAR","April 1", "₱1,500"));
        }
        else if ("02".equals(eventID)) {
            prices.add(new priceModel("VIP","April 3", "₱10,000"));
            prices.add(new priceModel("GOLD","April 3", "₱8,000"));
            prices.add(new priceModel("SILVER","April 3", "₱5,000"));
            prices.add(new priceModel("REGULAR","April 3", "₱3,000"));
        }
        else if ("03".equals(eventID)) {
            prices.add(new priceModel("VIP","April 3", "₱10,000"));
            prices.add(new priceModel("GOLD","April 3", "₱8,000"));
            prices.add(new priceModel("SILVER","April 3", "₱5,000"));
            prices.add(new priceModel("REGULAR","April 3", "₱3,000"));
        }
        else if ("04".equals(eventID)) {
            prices.add(new priceModel("VIP","April 3", "₱10,000"));
            prices.add(new priceModel("GOLD","April 3", "₱8,000"));
            prices.add(new priceModel("SILVER","April 3", "₱5,000"));
            prices.add(new priceModel("REGULAR","April 3", "₱3,000"));
        }
        else if ("05".equals(eventID)) {
            prices.add(new priceModel("VIP","April 3", "₱10,000"));
            prices.add(new priceModel("GOLD","April 3", "₱8,000"));
            prices.add(new priceModel("SILVER","April 3", "₱5,000"));
            prices.add(new priceModel("REGULAR","April 3", "₱3,000"));
        }
        else if ("06".equals(eventID)) {
            prices.add(new priceModel("VIP","April 3", "₱10,000"));
            prices.add(new priceModel("GOLD","April 3", "₱8,000"));
            prices.add(new priceModel("SILVER","April 3", "₱5,000"));
            prices.add(new priceModel("REGULAR","April 3", "₱3,000"));
        }
        
        return prices;
    }

	@Override
	public void init() {
		System.out.println("Init method of the price business service");
		prices = new ArrayList<priceModel>();
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method of the price business service");
	}
}
