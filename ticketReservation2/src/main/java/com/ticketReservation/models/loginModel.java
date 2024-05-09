package com.ticketReservation.models;

public class loginModel {
	
	String userName;
	String password;
	
	
	@Override
	public String toString() {
		return "loginModel [userName=" + userName + ", password=" + password + "]";
	}
	public loginModel() {
		super();
	}
	public loginModel(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
