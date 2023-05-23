/**
 * 
 */
package com.sharad.learn.corejava.inheritence.phone;

/**
 * @author XY57013
 *
 */
public class MediaPlayer implements BasicMediaPlayer {
	private String brand;
	private String power;
	private String soundSystem;
	
	public void close(){
		System.out.println("Exiting player");

	}
	public void forward() {
		System.out.println("Content forwarded 5 seconds");
	}
	public void reverse() {
		System.out.println("Content reversed 5 seconds");
	}
	public void record() {
		System.out.println("Recording Started");
	}
	public void stopRecording() {
		System.out.println("Recording Stopped");
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
	public String getSoundSystem() {
		return soundSystem;
	}
	public void setSoundSystem(String soundSystem) {
		this.soundSystem = soundSystem;
	}
	public MediaPlayer(String brand, String power, String soundSystem) {
		super();
		this.brand = brand;
		this.power = power;
		this.soundSystem = soundSystem;
	}
	@Override
	public String toString() {
		return "MediaPlayer [brand=" + brand + ", power=" + power + ", soundSystem=" + soundSystem + "]";
	}

}
