package com.ticketReservation.services;

import java.util.List;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.pricesModel;


public interface DetailsBusinessServiceInterface {
	
	public void init();
	
	public void destroy();
	
	public List<eventdetailsModel> getDecAve();
	
	public List<eventdetailsModel> getAuFest();
	
}
