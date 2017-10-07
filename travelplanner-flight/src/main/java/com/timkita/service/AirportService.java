package com.timkita.service;

import java.sql.SQLException;
import java.util.List;

import com.timkita.model.Airport;

public interface AirportService {
	
	public List<String> getAllAirportsCode() throws SQLException;
	
	public List<Airport> getAirports(String location);
	
}
