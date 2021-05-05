package com.cowin.vaccine;

import java.util.ArrayList;

public class sessions {
	private String session_id;
	private String date;
	private String available_capacity;
	private String min_age_limit;
	private String vaccine;
	private ArrayList<String> slots;
	private int flag;
	public sessions() {
	
	}
	
	

	public ArrayList<String> getSlots() {
		return slots;
	}



	public void setSlots(ArrayList<String> slots) {
		this.slots = slots;
	}



	


	public sessions(String session_id, String date, String available_capacity, String min_age_limit, String vaccine,
			ArrayList<String> slots, int flag) {
		super();
		this.session_id = session_id;
		this.date = date;
		this.available_capacity = available_capacity;
		this.min_age_limit = min_age_limit;
		this.vaccine = vaccine;
		this.slots = slots;
		this.flag = flag;
	}



	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAvailable_capacity() {
		return available_capacity;
	}
	public void setAvailable_capacity(String available_capacity) {
		this.available_capacity = available_capacity;
	}
	public String getMin_age_limit() {
		return min_age_limit;
	}
	public void setMin_age_limit(String min_age_limit) {
		this.min_age_limit = min_age_limit;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}



	public int getFlag() {
		return flag;
	}



	public void setFlag(int flag) {
		this.flag = flag;
	}


}
