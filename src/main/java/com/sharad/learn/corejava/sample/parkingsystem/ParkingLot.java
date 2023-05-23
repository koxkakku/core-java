package com.sharad.learn.corejava.sample.parkingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParkingLot {
	private List<ParkingSpot> parkingSpots;

	public ParkingLot(int freeCompactSpots, int freeLargeSpots, int freeSmallSpots) {
		parkingSpots = new ArrayList<>(freeCompactSpots+freeLargeSpots+freeSmallSpots);
		this.parkingSpots.addAll(generateParkingSpots(freeCompactSpots,ParkingSpotType.COMPACT));
		this.parkingSpots.addAll(generateParkingSpots(freeLargeSpots,ParkingSpotType.LARGE));
		this.parkingSpots.addAll(generateParkingSpots(freeSmallSpots,ParkingSpotType.SMALL));
	}

	private ArrayList<ParkingSpot> generateParkingSpots(int parkingCapacity, ParkingSpotType parkingSpotType) {
		return Stream.generate(()->new ParkingSpotFactory(parkingSpotType).getParkingSpot()).limit(parkingCapacity).collect(Collectors.toCollection(()->new ArrayList<>(parkingCapacity)));
	}

	// parkVehicle
	public void parkVehicle(Vehicle vehicle) throws NoParkingSpotFoundException {
		ParkingSpot freeSpot= this.getFreeParkingSpot(ParkingSpotFactory.getParkingSpotType(vehicle.getVehicleType()));
		vehicle.setParkingSpotType(freeSpot.getType());
		freeSpot.setFree(false);
		freeSpot.setVehicle(vehicle);
		System.out.println("Parked Vehicle successfully : "+vehicle);
	}

	private ParkingSpot getFreeParkingSpot(ParkingSpotType parkingSpotType) throws NoParkingSpotFoundException {
		return this.parkingSpots.stream()
				.filter(ps -> ps.getFree() && ps.getType().name().equals(parkingSpotType.name())).findAny()
				.orElseThrow(() -> new NoParkingSpotFoundException("Parking slots are full"));
	}


	// unparkVehicle
	public void unParkVehicle(int vehicleNo) throws NoParkingSpotFoundException {
		ParkingSpot occupiedParkingSpot = this.getOccupiedParkingSpot(vehicleNo);
		Vehicle vehicleTOUnpark = occupiedParkingSpot.getVehicle();
		vehicleTOUnpark.setParkingSpotType(null);
		occupiedParkingSpot.setFree(true);
		occupiedParkingSpot.setVehicle(null);
		System.out.println("Vehicle unparking successfull " + vehicleTOUnpark);
	}

	private ParkingSpot getOccupiedParkingSpot( int vehicleNo) throws NoParkingSpotFoundException {
		return this.parkingSpots.stream().filter(parkinSpot-> null!=parkinSpot.getVehicle()&&vehicleNo== parkinSpot.getVehicle().getVehicleNo()).findFirst().orElseThrow(()->new NoParkingSpotFoundException(String.format("Vehicle with no. %d not parked here", vehicleNo)));
	}

	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	

}
