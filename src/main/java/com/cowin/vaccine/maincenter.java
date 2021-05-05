package com.cowin.vaccine;

import java.util.ArrayList;

public class maincenter {
private ArrayList<centers> centers= new ArrayList<centers>();

public maincenter() {
	
}


public maincenter(ArrayList<com.cowin.vaccine.centers> centers) {
	super();
	this.centers = centers;
}


public ArrayList<centers> getCenters() {
	return centers;
}

public void setCenters(ArrayList<centers> centers) {
	this.centers = centers;
}


}





