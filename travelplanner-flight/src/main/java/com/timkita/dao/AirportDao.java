package com.timkita.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import com.timkita.model.Airport;

@SessionScoped
public class AirportDao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	Connection connection;
	
	public List<String> getAllAirportsCode() throws SQLException{
		
		PreparedStatement statement = connection.prepareStatement("SELECT * FROM airport");
		ResultSet resultSet = statement.executeQuery();
        List<String> airports = new ArrayList<String>();
        while (resultSet.next()) 
            airports.add(resultSet.getString(1));

        return airports;
        
	}
	
	public List<Airport> getAirports(String location){
		
		List<Airport> airports = new ArrayList<Airport>();
		
		Airport airport = new Airport();
		airports.add(airport);
		
		return airports;
		
	}
	
}
