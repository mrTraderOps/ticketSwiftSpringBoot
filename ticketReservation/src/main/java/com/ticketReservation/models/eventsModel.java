package com.ticketReservation.models;

public class eventsModel {
	
	private String eventID;
	private String eventsList;
	private String eventName;
	private String eventShort;
	private String eventAvailTicket;
	private String eventSoldTicket;
	private String Username;
	
	
	
	
	public eventsModel(String eventID) {
		super();
		this.eventID = eventID;
	}
	public String getEventID() {
		return eventID;
	}
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
	@Override
	public String toString() {
		return "eventsModel [eventsList=" + eventsList + ", eventName=" + eventName + ", eventShort=" + eventShort
				+ ", eventAvailTicket=" + eventAvailTicket + ", eventSoldTicket=" + eventSoldTicket + ", Username="
				+ Username + "]";
	}
	public eventsModel() {
		super();
	}
	public eventsModel(String eventsList, String eventName, String eventShort, String eventAvailTicket,
			String eventSoldTicket, String username) {
		super();
		this.eventsList = eventsList;
		this.eventName = eventName;
		this.eventShort = eventShort;
		this.eventAvailTicket = eventAvailTicket;
		this.eventSoldTicket = eventSoldTicket;
		Username = username;
	}
	public String getEventsList() {
		return eventsList;
	}
	public void setEventsList(String eventsList) {
		this.eventsList = eventsList;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventShort() {
		return eventShort;
	}
	public void setEventShort(String eventShort) {
		this.eventShort = eventShort;
	}
	public String getEventAvailTicket() {
		return eventAvailTicket;
	}
	public void setEventAvailTicket(String eventAvailTicket) {
		this.eventAvailTicket = eventAvailTicket;
	}
	public String getEventSoldTicket() {
		return eventSoldTicket;
	}
	public void setEventSoldTicket(String eventSoldTicket) {
		this.eventSoldTicket = eventSoldTicket;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	

}
