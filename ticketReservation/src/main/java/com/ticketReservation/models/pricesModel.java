package com.ticketReservation.models;

public class pricesModel {
	
	long id = 0;
	String seatLevel = "";
	float price = 0;
	String date = "";
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSeatLevel() {
		return seatLevel;
	}
	public void setSeatLevel(String seatLevel) {
		this.seatLevel = seatLevel;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
		
	}
	@Override
	public String toString() {
		return "pricesModel [id=" + id + ", seatLevel=" + seatLevel + ", price=" + price + ", date=" + date + "]";
	}
	
	public pricesModel(long id, String seatLevel, float price, String date) {
		super();
		this.id = id;
		this.seatLevel = seatLevel;
		this.price = price;
		this.date = date;
	}
	
	public pricesModel() {
		super();
	}
	
	
}
