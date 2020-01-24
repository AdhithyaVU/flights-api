package com.pilot.flightsapi.entity;

public class Data {

	private String source;
	private String destination;
	private String departureTime;
	private String arrivalTime;

	public Data(String source, String destination, String departureTime, String arrivalTime) {
		super();
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		return "Data [source=" + source + ", destination=" + destination + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + "]";
	}

}
