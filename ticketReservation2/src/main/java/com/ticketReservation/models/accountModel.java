package com.ticketReservation.models;

public class accountModel {
	
	private String Username;
	private String password;
	
	
	@Override
	public String toString() {
		return "accountModel [Username=" + Username + ", password=" + password + "]";
	}
	public accountModel() {
		super();
	}
	public accountModel(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
