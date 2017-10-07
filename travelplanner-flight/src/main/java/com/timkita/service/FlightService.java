package com.timkita.service;

import java.util.Date;
import java.util.List;

import com.timkita.model.Airport;
import com.timkita.model.Flight;

public interface FlightService {
	
	public List<Flight> getFlights(List<Airport> origins, Date date, double budget);
	
}