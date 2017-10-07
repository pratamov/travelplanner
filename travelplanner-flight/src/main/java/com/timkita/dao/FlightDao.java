package com.timkita.dao;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import org.apache.commons.lang.time.DateUtils;

import com.timkita.model.Airport;
import com.timkita.model.Carrier;
import com.timkita.model.Flight;

@SessionScoped
public class FlightDao implements Serializable{

	private static final long serialVersionUID = 1L;

	public List<Flight> getFlights(List<Airport> origins, Date date, double budget) {
		
		List<Flight> flights = new ArrayList<Flight>();
		
		Carrier carrier = new Carrier();
		carrier.setName("Singapore Airline");
		
		Airport destination = new Airport();
		destination.setCode("SLC");
		destination.setLatitude("40.78501");
		destination.setLongitude("-111.98285");
		destination.setLocation("Salt Lake City, USA");
		destination.setTimeZoneName("America/Denver");
		
		Flight flight = new Flight();
		flight.setArrival(date);
		flight.setDeparture(DateUtils.addHours(date, 8));
		flight.setCarrier(carrier);
		flight.setOrigin(origins.get(0));
		flight.setDestination(destination);
		flight.setPrice(budget * 0.8);
		
		flights.add(flight);
		return flights;
		
	}
}
