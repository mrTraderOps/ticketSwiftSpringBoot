package com.ticketReservation.services;

import java.util.List;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.pricesModel;


public interface DetailsBusinessServiceInteface {
	
	public List<eventdetailsModel> getDecAve();
	
	public List<eventdetailsModel> getKeshi();
	
	public List<eventdetailsModel> getDion();
	
	public List<eventdetailsModel> getCircus();
	
	public List<eventdetailsModel> getZack();
	
	public List<eventdetailsModel> getAuFest();	
}
