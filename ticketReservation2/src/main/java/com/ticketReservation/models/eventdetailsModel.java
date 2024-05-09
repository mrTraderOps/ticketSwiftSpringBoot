package com.ticketReservation.models;

public class eventdetailsModel {
	
	long id = 0;
	String event_name = "";
	String seat_level = "";
	String prices = "";
	String date = "";
	
	public eventdetailsModel(long id, String event_name, String seat_level, String prices, String date) {
		super();
		this.id = id;
		this.event_name = event_name;
		this.seat_level = seat_level;
		this.prices = prices;
		this.date = date;
	}

	public eventdetailsModel() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
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
		return "eventdetailsModel [id=" + id + ", event_name=" + event_name + ", seat_level=" + seat_level + ", prices="
				+ prices + ", date=" + date + "]";
	}
}
