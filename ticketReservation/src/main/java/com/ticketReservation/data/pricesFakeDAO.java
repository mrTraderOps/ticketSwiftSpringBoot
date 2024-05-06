package com.ticketReservation.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.ticketReservation.models.priceModel;

@Repository
public class pricesFakeDAO implements PricesDataAccessInterface {

	List<priceModel> prices = new ArrayList<priceModel>();
	
	public pricesFakeDAO () {
		prices.add(new priceModel("VIP","April 1", 4410));
		prices.add(new priceModel("GOLD","April 1", 3500));
		prices.add(new priceModel("SILVER","April 1", 2000));
		prices.add(new priceModel("REGULAR","April 1", 1500));
	}
	
//	public pricesFakeDAO(String eventID) {
//		if ("01".equals(eventID)) {
//		    prices.add(new priceModel("VIP","April 1", "₱4,410"));
//		    prices.add(new priceModel("GOLD","April 1", "₱3,500"));
//		    prices.add(new priceModel("SILVER","April 1", "₱2,000"));
//		    prices.add(new priceModel("REGULAR","April 1", "₱1,500"));
//		}
//		else if ("02".equals(eventID)) {
//		    prices.add(new priceModel("VIP","April 3", "₱10,000"));
//		    prices.add(new priceModel("GOLD","April 3", "₱8,000"));
//		    prices.add(new priceModel("SILVER","April 3", "₱5,000"));
//		    prices.add(new priceModel("REGULAR","April 3", "₱3,000"));
//		}
//	}

	@Override
	public priceModel getByPrice(long price) {
		for (int i=0; i<prices.size(); i++) {
			if (prices.get(i).getPrice() == price) {
				return prices.get(i);
			}
		}
		return null;
	}

	@Override
	public List<priceModel> getPrices() {

		return prices;
	}

	@Override
	public List<priceModel> searchPrices(String searchTerm) {
		
		List<priceModel> foundItems = new ArrayList<priceModel>();
		
		for (int i=0; i<prices.size(); i++) {
			if(prices.get(i).getDate().toLowerCase().contains(searchTerm.toLowerCase())) {
				foundItems.add(prices.get(i));
			}
		}
		return foundItems;
	}

	@Override
	public long addOne(priceModel newPrice) {
		
		boolean success = prices.add(newPrice);
		if(success) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean deleteOne(long price) {
		for (int i=0; i<prices.size(); i++) {
			if (prices.get(i).getPrice() == price) {
				prices.remove(i);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public priceModel updateOne(long priceToUpdate, priceModel updatePrice) {
		for (int i=0; i<prices.size(); i++) {
			if (prices.get(i).getPrice() == priceToUpdate) {
				prices.set(i, updatePrice);
				return prices.get(i);
			}
		}
		
		return null;
	}

}




