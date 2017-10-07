package com.timkita.model;

public class Airport {
	
	private String code;
	private String location;
	private String timeZoneName;
	private String latitude;
	private String longitude;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimeZoneName() {
		return timeZoneName;
	}
	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Airport [code=" + code + ", location=" + location + ", timeZoneName=" + timeZoneName + ", latitude="
				+ latitude + ", longitude=" + longitude + ", name=" + name + "]";
	}
	
	
}
