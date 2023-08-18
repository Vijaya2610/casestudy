package com.example;

public class Location {
	private String locationName;

	public Location() {
		super();
	}

	public Location(String locationName) {
		super();
		this.locationName = locationName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + "]";
	}
	

}
