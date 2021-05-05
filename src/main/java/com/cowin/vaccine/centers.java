package com.cowin.vaccine;

import java.util.ArrayList;

public class centers {
private String center_id;
private String name;
private String address;
private String state_name;
private String district_name;
private String block_name;
private String pincode;
private String lat;
private String Long;
private String from;
private String to;
private String fee_type;
private ArrayList<sessions> sessions;

public centers() {
	
}

public centers(String center_id, String name, String address, String state_name, String district_name,
		String block_name, String pincode, String lat, String l, String from, String to, String fee_type,
		ArrayList<sessions> sessions) {
	super();
	this.center_id = center_id;
	this.name = name;
	this.address = address;
	this.state_name = state_name;
	this.district_name = district_name;
	this.block_name = block_name;
	this.pincode = pincode;
	this.lat = lat;
	Long = l;
	this.from = from;
	this.to = to;
	this.fee_type = fee_type;
	this.sessions = sessions;
}

public String getCenter_id() {
	return center_id;
}

public void setCenter_id(String center_id) {
	this.center_id = center_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getState_name() {
	return state_name;
}

public void setState_name(String state_name) {
	this.state_name = state_name;
}

public String getDistrict_name() {
	return district_name;
}

public void setDistrict_name(String district_name) {
	this.district_name = district_name;
}

public String getBlock_name() {
	return block_name;
}

public void setBlock_name(String block_name) {
	this.block_name = block_name;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getLat() {
	return lat;
}

public void setLat(String lat) {
	this.lat = lat;
}

public String getLong() {
	return Long;
}

public void setLong(String l) {
	Long = l;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public String getFee_type() {
	return fee_type;
}

public void setFee_type(String fee_type) {
	this.fee_type = fee_type;
}

public ArrayList<sessions> getSessions() {
	return sessions;
}

public void setSessions(ArrayList<sessions> sessions) {
	this.sessions = sessions;
}

}
