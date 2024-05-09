package com.ticketReservation.data;

import java.util.List;

import com.ticketReservation.models.priceModel;
import com.ticketReservation.models.pricesModel;

public interface PricesDataAccessInterface2<T> {

	public T getById (long id);
	public List<T> getPrices();
	public List<T> searchPrices(String searchTerm);
	public long addOne(T newPrice);
	public boolean deleteOne(long id);
	public T updateOne(long idToUpdate, T updateDetails);
}
