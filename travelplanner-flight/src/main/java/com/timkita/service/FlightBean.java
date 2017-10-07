package com.timkita.service;

import java.util.Date;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.timkita.dao.FlightDao;
import com.timkita.model.Airport;
import com.timkita.model.Flight;

@Stateless
public class FlightBean implements FlightService{
	
	@Inject
	FlightDao flightDao;

	public List<Flight> getFlights(List<Airport> origins, Date date, double budget) {
		flightDao = new FlightDao();
		return flightDao.getFlights(origins, date, budget);
	}

}
