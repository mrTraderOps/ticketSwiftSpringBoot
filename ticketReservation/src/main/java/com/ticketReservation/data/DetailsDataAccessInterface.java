package com.ticketReservation.data;

import java.util.List;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.pricesModel;


public interface DetailsDataAccessInterface {
	
	public List<eventdetailsModel> getDecAve();
	
	public List<eventdetailsModel> getAuFest();
	
}
