package com.bridgelab.hotelsystem;

import java.util.ArrayList;

public class HotelReservation {
	ArrayList<Hotel> hotels = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program.");
		
		HotelReservation reservation = new HotelReservation();
		reservation.addHotel("LakeWood", 110, 90);
		reservation.addHotel("BridgeWood", 160, 60);
		reservation.addHotel("RidgeWood", 220, 150);
	}

	
	public void addHotel(String hotelName, int weekdayRateForRegularCus, int weekendRateForRegularCus) {
		hotels.add(new Hotel(hotelName,weekdayRateForRegularCus,weekendRateForRegularCus));
	}
}
