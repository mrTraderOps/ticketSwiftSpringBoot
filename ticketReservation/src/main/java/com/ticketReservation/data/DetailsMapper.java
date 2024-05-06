package com.ticketReservation.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.pricesModel;

public class DetailsMapper implements RowMapper<eventdetailsModel> {

	@Override
	public eventdetailsModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		// get the result set
		
		// create a new order object
		
		// return it.
		
		eventdetailsModel details = new eventdetailsModel(rs.getLong("id"), rs.getString("event_name"),rs.getString("seat_level"),rs.getString("prices"), rs.getString("date"));
		
		return details;
	}

}
