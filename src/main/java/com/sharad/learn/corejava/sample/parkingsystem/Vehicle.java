package com.sharad.learn.corejava.sample.parkingsystem;

public class Vehicle {

	private int vehicleNo;
	private VehicleType vehicleType;
	private ParkingSpotType parkingSpotType;
	
	public Vehicle(VehicleType vehicleType)
	{
		this.vehicleType = vehicleType;
	}
	
	public int getVehicleNo() {
		return vehicleNo;
	}
	
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public ParkingSpotType getParkingSpotType() {
		return parkingSpotType;
	}
	
	public void setParkingSpotType(ParkingSpotType parkingSpotType)
	{
		this.parkingSpotType = parkingSpotType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + ", parkingSpotType="
				+ parkingSpotType + "]";
	}
	
}
