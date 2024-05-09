package com.ticketReservation.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ticketReservation.data.DetailsDataAccessInterface;
import com.ticketReservation.models.eventdetailsModel;



public class DetailsBusinessService implements DetailsBusinessServiceInterface {

	
	@Autowired
	DetailsDataAccessInterface<eventdetailsModel> detailsDAO;
	
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

	@Override
	public List<eventdetailsModel> getKeshi() {
		// TODO Auto-generated method stub
		return detailsDAO.getKeshi();
	}

	@Override
	public List<eventdetailsModel> getDion() {
		// TODO Auto-generated method stub
		return detailsDAO.getDion();
	}

	@Override
	public List<eventdetailsModel> getCircus() {
		// TODO Auto-generated method stub
		return detailsDAO.getCircus();
	}

	@Override
	public List<eventdetailsModel> getZack() {
		// TODO Auto-generated method stub
		return detailsDAO.getZack();
	}

	@Override
	public long addOne(eventdetailsModel newDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public eventdetailsModel updateOne(long idToUpdate, eventdetailsModel updateDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
