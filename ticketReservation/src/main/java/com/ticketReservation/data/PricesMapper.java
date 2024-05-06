package com.ticketReservation.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ticketReservation.models.pricesModel;

public class PricesMapper implements RowMapper<pricesModel> {

	@Override
	public pricesModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		// get the result set
		
		// create a new order object
		
		// return it.
		
		pricesModel prices = new pricesModel(rs.getLong("id"), rs.getString("seatLevel"), rs.getFloat("price"), rs.getString("date"));
		
		return prices;
	}

}
