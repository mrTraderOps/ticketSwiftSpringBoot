package com.ticketReservation.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ticketReservation.models.priceModel;
import com.ticketReservation.models.pricesModel;

@Repository
public class PricesDataService implements PricesDataAccessInterface2 {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public pricesModel getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<pricesModel> getPrices() {
		List<pricesModel> results = jdbcTemplate.query("SELECT * FROM decaveprices", new PricesMapper());
		
		return results;
	}

	@Override
	public List<pricesModel> searchPrices(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addOne(pricesModel newPrice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteOne(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public pricesModel updateOne(long idToUpdate, pricesModel updatePrice) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
