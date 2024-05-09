package com.ticketReservation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("decaveprices")
public class detailsEntity {
	
	@Id
	@Column("id")
	long id = 0;
	
	@Column("seatLevel")
	String seatLevel = "";
	
	@Column("price")
	float price = 0;
	
	@Column("date")
	String date = "";
	
	
//	public pricesEntity() {
//		
//	}
	
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
	
	public detailsEntity(long id, String seatLevel, float price, String date) {
		super();
		this.id = id;
		this.seatLevel = seatLevel;
		this.price = price;
		this.date = date;
	}
	
	public detailsEntity() {
		super();
	}
	
	
}
