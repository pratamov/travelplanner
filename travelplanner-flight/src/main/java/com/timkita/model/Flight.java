package com.timkita.model;

import java.util.Date;

public class Flight {
	
	private Airport origin;
	private Airport destination;
	private Date departure;
	private Date arrival;
	private Carrier carrier;
	private double price;
	public Airport getOrigin() {
		return origin;
	}
	public void setOrigin(Airport origin) {
		this.origin = origin;
	}
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	public Date getDeparture() {
		return departure;
	}
	public void setDeparture(Date departure) {
		this.departure = departure;
	}
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	public Carrier getCarrier() {
		return carrier;
	}
	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flight [origin=" + origin + ", destination=" + destination + ", departure=" + departure + ", arrival="
				+ arrival + ", carrier=" + carrier + ", price=" + price + "]";
	}
	
}
