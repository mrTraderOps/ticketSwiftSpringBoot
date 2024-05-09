package com.ticketReservation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("details")
public class detailsEntity {
	
	@Id
	@Column("id")
	long id = 0;
	
	@Column("event")
	String event = "";
	
	@Column("seat_level")
	String seat_level = "";
	
	@Column("prices")
	String prices = "";
	
	@Column("date")
	String date = "";
	
	public detailsEntity(long id, String event_name, String seat_level, String prices, String date) {
		super();
		this.id = id;
		this.event= event;
		this.seat_level = seat_level;
		this.prices = prices;
		this.date = date;
	}

	public detailsEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent_name(String event) {
		this.event= event;
	}

	public String getSeat_level() {
		return seat_level;
	}

	public void setSeat_level(String seat_level) {
		this.seat_level = seat_level;
	}

	public String getPrices() {
		return prices;
	}

	public void setPrices(String prices) {
		this.prices = prices;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "eventdetailsModel [id=" + id + ", event_name=" + event+ ", seat_level=" + seat_level + ", prices="
				+ prices + ", date=" + date + "]";
	}
}
