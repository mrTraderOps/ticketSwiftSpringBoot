package com.ticketReservation.models;

public class priceModel {
	
	String location = "";
	String date = "";
	String price = "";
	
	public priceModel( String location, String date, String price) {
		super();
		this.location = location;
		this.date = date;
		this.price = price;
	}

	@Override
	public String toString() {
		return "priceModel [location=" + location + ", date=" + date + ", price=" + price + "]";
	}



	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	



}
