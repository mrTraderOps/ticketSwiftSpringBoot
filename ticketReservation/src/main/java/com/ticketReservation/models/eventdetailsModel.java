package com.ticketReservation.models;

public class eventdetailsModel {
	
	String firstDetails = "";
	String secondDetails = "";
	
	
	public String getFirstDetails() {
		return firstDetails;
	}
	public void setFirstDetails(String firstDetails) {
		this.firstDetails = firstDetails;
	}
	public String getSecondDetails() {
		return secondDetails;
	}
	public void setSecondDetails(String secondDetails) {
		this.secondDetails = secondDetails;
	}
	public eventdetailsModel(String firstDetails, String secondDetails) {
		super();
		this.firstDetails = firstDetails;
		this.secondDetails = secondDetails;
	}
	@Override
	public String toString() {
		return "eventdetailsModel [firstDetails=" + firstDetails + ", secondDetails=" + secondDetails + "]";
	}
	public eventdetailsModel() {
		super();
	}
	
	

}
