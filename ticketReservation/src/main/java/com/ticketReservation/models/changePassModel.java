package com.ticketReservation.models;

public class changePassModel {
	
	String pass1 = "";
	String pass2 = "";
	
	
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	public changePassModel(String pass1, String pass2) {
		super();
		this.pass1 = pass1;
		this.pass2 = pass2;
	}
	public changePassModel() {
		super();
	}
	@Override
	public String toString() {
		return "changePassModel [pass1=" + pass1 + ", pass2=" + pass2 + "]";
	}
	
	
}
