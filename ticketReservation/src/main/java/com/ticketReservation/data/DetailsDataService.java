package com.ticketReservation.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.priceModel;
import com.ticketReservation.models.pricesModel;
import com.ticketReservation.services.DetailsBusinessServiceInterface;

@Repository
@Primary
public class DetailsDataService implements DetailsDataAccessInterface{

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
}
