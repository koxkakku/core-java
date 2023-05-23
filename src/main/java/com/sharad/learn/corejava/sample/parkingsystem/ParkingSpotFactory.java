package com.sharad.learn.corejava.sample.parkingsystem;

public class ParkingSpotFactory {
	
	private ParkingSpotType parkingSpotType;
	public ParkingSpotFactory(ParkingSpotType parkingSpotType) {
		super();
		this.parkingSpotType = parkingSpotType;
	}
	public ParkingSpot getParkingSpot() {
		switch(parkingSpotType) {
			case SMALL: return new SmallSpot();
			case LARGE: return new LargeSpot();
			case COMPACT: 
			default: return new CompactSpot();
		}
	}
	public static ParkingSpotType getParkingSpotType(VehicleType vehicleType) {
		switch(vehicleType) {
		case BIKE: return ParkingSpotType.SMALL;
		case TRUCK: return ParkingSpotType.LARGE;
		case CAR: 
		default :return ParkingSpotType.COMPACT;
		}
	}
}
