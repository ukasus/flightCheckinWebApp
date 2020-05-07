package com.example.ujjawal.flightcheckin.integrations.dto;

public class reservation {
	private long id;
	private boolean checkedIn;
	private int numberOfBags;
	
	private passenger passenger;
	
	private flight flight;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(passenger passenger) {
		this.passenger = passenger;
	}
	public flight getFlight() {
		return flight;
	}
	public void setFlight(flight flight) {
		this.flight = flight;
	}
	
	
	
	

}
