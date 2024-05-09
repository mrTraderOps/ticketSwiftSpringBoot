package com.ticketReservation.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.services.DetailsBusinessServiceInterface;


public class DetailsDataService implements DetailsDataAccessInterface<eventdetailsModel>{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<eventdetailsModel> getDecAve() {

		List<eventdetailsModel> results = jdbcTemplate.query("SELECT * FROM details WHERE event_name='decAve'", new DetailsMapper());
		
		return results;
	}

	@Override
	public List<eventdetailsModel> getAuFest() {
			
		List<eventdetailsModel> results = jdbcTemplate.query("SELECT * FROM details WHERE event_name='AuFest'", new DetailsMapper());
		
		return results;
	}

	@Override
	public List<eventdetailsModel> getKeshi() {
		List<eventdetailsModel> results = jdbcTemplate.query("SELECT * FROM details WHERE event_name='keshi'", new DetailsMapper());
		
		return results;
	}

	@Override
	public List<eventdetailsModel> getDion() {
		List<eventdetailsModel> results = jdbcTemplate.query("SELECT * FROM details WHERE event_name='Dion'", new DetailsMapper());
		
		return results;
	}

	@Override
	public List<eventdetailsModel> getCircus() {
		List<eventdetailsModel> results = jdbcTemplate.query("SELECT * FROM details WHERE event_name='Circus'", new DetailsMapper());
		
		return results;
	}

	@Override
	public List<eventdetailsModel> getZack() {
		List<eventdetailsModel> results = jdbcTemplate.query("SELECT * FROM details WHERE event_name='Zack'", new DetailsMapper());
		
		return results;
	}


	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long addOne(eventdetailsModel newDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public eventdetailsModel updateOne(long idToUpdate, eventdetailsModel updateDetails) {
		// TODO Auto-generated method stub
		return null;
	}
}
