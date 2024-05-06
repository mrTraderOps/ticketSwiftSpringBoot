package com.ticketReservation.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ticketReservation.data.DetailsDataAccessInterface;
import com.ticketReservation.data.PricesDataAccessInterface2;
import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.priceModel;
import com.ticketReservation.models.pricesModel;


public class DetailsBusinessService implements DetailsBusinessServiceInterface {

	
	@Autowired
	DetailsDataAccessInterface detailsDAO;
	
	@Override
	public void init() {
		System.out.println("Init method of the price business service");
		
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method of the price business service");
		
	}

	@Override
	public List<eventdetailsModel> getDecAve() {
		
		return detailsDAO.getDecAve();
	}

	@Override
	public List<eventdetailsModel> getAuFest() {
		
		return detailsDAO.getAuFest();
	}
	
}
