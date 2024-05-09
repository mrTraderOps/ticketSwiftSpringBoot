package com.ticketReservation.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.ticketReservation.models.priceModel;
import com.ticketReservation.models.pricesModel;

@Repository
public class PricesDataService implements PricesDataAccessInterface2<pricesModel> {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public pricesModel getById(long id) {
		List<pricesModel> results = jdbcTemplate.query("SELECT * FROM decaveprices WHERE id = ?",  new PricesMapper(), id);
		
		if (results.size() > 0) {
			return results.get(0);	
		} else {
			return null;
		}
		
	}

	@Override
	public List<pricesModel> getPrices() {
		List<pricesModel> results = jdbcTemplate.query("SELECT * FROM decaveprices", new PricesMapper());
		
		return results;
	}

	@Override
	public List<pricesModel> searchPrices(String searchTerm) {
		List<pricesModel> results = jdbcTemplate.query("SELECT * FROM decaveprices WHERE seatLevel LIKE ?", new PricesMapper(), "%" + searchTerm + "%");
		return results;
	}

	@Override
	public long addOne(pricesModel newPrice) {
//		long result = jdbcTemplate.update("INSERT INTO decaveprices (seatLevel, price, date) VALUES (?, ?, ?)", 
//				newPrice.getSeatLevel(),
//				newPrice.getPrice(),
//				newPrice.getDate());
//		
//		return result;
		SimpleJdbcInsert simpleInsert = new SimpleJdbcInsert(jdbcTemplate);
		
		simpleInsert.withTableName("decaveprices").usingGeneratedKeyColumns("ID");
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		parameters.put("seatLevel", newPrice.getSeatLevel());
		parameters.put("price", newPrice.getPrice());
		parameters.put("date", newPrice.getDate());
		
		Number result = simpleInsert.executeAndReturnKey(parameters);
		
		return result.longValue();
	}

	@Override
	public boolean deleteOne(long id) {
		int result = jdbcTemplate.update("DELETE FROM decaveprices WHERE id = ?",id);
		
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public pricesModel updateOne(long idToUpdate, pricesModel updatePrice) {
		int result = jdbcTemplate.update("UPDATE decaveprices SET seatLevel = ?, price = ?, date = ? WHERE id = ?",
				updatePrice.getSeatLevel(),
				updatePrice.getPrice(),
				updatePrice.getDate(),
				idToUpdate);
		if (result > 0 ) {
			return updatePrice;
		} else {
			return null;
		}
	}

	
}
