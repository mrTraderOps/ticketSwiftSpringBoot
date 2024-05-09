package com.ticketReservation.data;

import java.util.List;

public interface DetailsDataAccessInterface<T> {
	
	public List<T> getDecAve();
	
	public List<T> getKeshi();
	
	public List<T> getDion();
	
	public List<T> getCircus();
	
	public List<T> getZack();
	
	public List<T> getAuFest();
	
	public long addOne(T newDetails);
	
	public boolean deleteOne(long id);
	
	public T updateOne(long idToUpdate, T updateDetails);
}
