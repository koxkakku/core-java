package com.sharad.learn.corejava.inheritence.phone;

public class MusicPlayer implements BasicMediaPlayer {
	private String brand;
	private String power;
	public void close(){
		System.out.println("Player Closed");

	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public MusicPlayer(String brand, String power) {
		super();
		this.brand = brand;
		this.power = power;
	}
	@Override
	public String toString() {
		return "MusicPlayer [brand=" + brand + ", power=" + power + "]";
	}

}
