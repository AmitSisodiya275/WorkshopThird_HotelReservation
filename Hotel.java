package com.bridgelab.hotelsystem;

public class Hotel {
	
	String hotelName;
	int weekdayRateForRegularCus;
	int weekendRateForRegularCus;
	
	public Hotel(String hotelName, int weekdayRateForRegularCus, int weekendRateForRegularCus) {
		this.hotelName = hotelName;
		this.weekdayRateForRegularCus = weekdayRateForRegularCus;
		this.weekendRateForRegularCus = weekendRateForRegularCus;
	}
	
}
