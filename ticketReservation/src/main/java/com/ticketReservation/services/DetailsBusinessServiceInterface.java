package com.ticketReservation.services;

import java.util.List;

import com.ticketReservation.models.eventdetailsModel;


public interface DetailsBusinessServiceInterface {
	
	public void init();
	
	public void destroy();
	
	public List<eventdetailsModel> getDecAve();
	
	public List<eventdetailsModel> getKeshi();
	
	public List<eventdetailsModel> getDion();
	
	public List<eventdetailsModel> getCircus();
	
	public List<eventdetailsModel> getZack();
	
	public List<eventdetailsModel> getAuFest();	
	
	public long addOne(eventdetailsModel newDetails);
	
	public boolean deleteOne(long id);
	
	public eventdetailsModel updateOne(long idToUpdate, eventdetailsModel updateDetails);
	
}
