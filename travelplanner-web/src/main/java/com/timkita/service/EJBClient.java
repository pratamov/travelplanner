package com.timkita.service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;

import com.timkita.model.Airport;
import com.timkita.model.Flight;

public class EJBClient {
	@EJB
	private FlightBean flightBean;

	@EJB
	private AirportBean airportBean;

	public List<Flight> getFlights(List<Airport> origins, Date date, double budget) {
		return flightBean.getFlights(origins, date, budget);
	}

	public List<Airport> getAirports(String location) {
		return airportBean.getAirports(location);
	}
}
