package com.sharad.learn.corejava.sample.parkingsystem;
public class ParkingSpot {

	private ParkingSpotType type;
	private Vehicle vehicle;
	private Boolean free;
	
	//Constructor
	public ParkingSpot(ParkingSpotType parkingSpotType)
	{
		 this.type = parkingSpotType;
		 this.free = true;
		 this.vehicle=null;
	}

	//Getter and Setter
	public ParkingSpotType getType() {
		return type;
	}

	public void setType(ParkingSpotType type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Boolean getFree() {
		return free;
	}

	public void setFree(Boolean free) {
		this.free = free;
	}

	@Override
	public String toString() {
		return "ParkingSpot [type=" + type + ", vehicle=" + vehicle + ", free=" + free + "]";
	}
	
	
	


}
