package com.timkita.service;

import java.util.List;

import javax.inject.Inject;

import com.timkita.dao.HotelDao;
import com.timkita.model.Hotel;
import com.timkita.model.Location;

public class HotelBean implements HotelService{

	@Inject
	HotelDao hotelDao;
	
	public List<Hotel> getHotels(Location location, double budget) {
		return hotelDao.getHotels(location, budget);
	}

}
