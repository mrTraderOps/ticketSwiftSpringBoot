package com.ticketReservation.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.userModel;

public class userMapper implements RowMapper<userModel> {

	@Override
	public userModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		// get the result set
		
		// create a new order object
		
		// return it.
		
		userModel details = new userModel(rs.getLong("id"), rs.getString("email"),rs.getString("firstName"),rs.getString("lastName"), rs.getString("gender"),rs.getString("username"),rs.getString("password"));
		
		return details;
	}

}
