package com.timkita.dao;

import java.util.ArrayList;
import java.util.List;

import com.timkita.model.Hotel;
import com.timkita.model.Location;
import com.timkita.service.HotelService;

public class HotelDao implements HotelService{

	public List<Hotel> getHotels(Location location, double budget) {
		List hotels = new ArrayList<Hotel>();
		
		Hotel hotel = new Hotel();
		
		hotels.add(hotel);
		
		return hotels;
	}

}
