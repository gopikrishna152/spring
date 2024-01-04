package com.spring.spring_annotations;

public class Idea { 
	
	
	private int imei; 
	private String towerloc;
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public String getTowerloc() {
		return towerloc;
	}
	public void setTowerloc(String towerloc) {
		this.towerloc = towerloc;
	}
	@Override
	public String toString() {
		return "Idea [imei=" + imei + ", towerloc=" + towerloc + "]";
	}
	public Idea(int imei, String towerloc) {
		super();
		this.imei = imei;
		this.towerloc = towerloc;
	} 
	

}
