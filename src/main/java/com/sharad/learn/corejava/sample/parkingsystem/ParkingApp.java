package com.sharad.learn.corejava.sample.parkingsystem;

import java.util.stream.IntStream;

public class ParkingApp {

	public static void main(String[] args) throws NoParkingSpotFoundException {
		  
		 ParkingLot parkingLot = new ParkingLot(5,5,5);
		 IntStream.range(0, 5).forEach(i->{
			 Vehicle truck = new Vehicle(VehicleType.TRUCK);
	         truck.setVehicleNo(i);
	         try {
				parkingLot.parkVehicle(truck);
			} catch (NoParkingSpotFoundException e) {
				e.printStackTrace();
			}
		 });
		 IntStream.range(5, 10).forEach(i->{
			 Vehicle car = new Vehicle(VehicleType.CAR);
	         car.setVehicleNo(i);
	         try {
	        	 parkingLot.parkVehicle(car);
			} catch (NoParkingSpotFoundException e) {
				e.printStackTrace();
			}
		 });
		 parkingLot.getParkingSpots().forEach(System.out::println);
		 parkingLot.unParkVehicle(3);
		 parkingLot.getParkingSpots().forEach(System.out::println);
	}

}
