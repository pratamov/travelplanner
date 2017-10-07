package com.timkita.service;

import java.util.List;

import com.timkita.model.Hotel;
import com.timkita.model.Location;

public interface HotelService {
	
	public List<Hotel> getHotels(Location location, double budget);
	
}
