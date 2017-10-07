package com.timkita.service;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.timkita.dao.AirportDao;
import com.timkita.model.Airport;

@Stateless
public class AirportBean implements AirportService {

	@Inject
	private AirportDao airportDao;
	
	public List<Airport> getAirports(String location) {
		airportDao = new AirportDao();
		return airportDao.getAirports(location);
	}

	public List<String> getAllAirportsCode() throws SQLException {
		return airportDao.getAllAirportsCode();
	}

}
