/**
 * 
 */
package com.sharad.learn.corejava.inheritence.phone;

/**
 * @author koxkakku
 *
 */
public class BasicPhone {
	private boolean hasRadio;
	private boolean hasBlueTooth;
	private boolean hasInfraRed;
	private boolean hasMusicPlayer;
	private boolean hasTouchScreen;
	private boolean hasWifi;
	private boolean isDataEnabled;
	private boolean hasCamera;
	private Model model;
	private KeypadType keyPadType;
	public void makeVoiceCall(String number) {
		System.out.println(String.format("Making call to %s", number));
	}
	public void describe() {
		System.out.println(this.model.toString());
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public BasicPhone(Model model, KeypadType keyPadType) {
		super();
		this.model = model;
		this.keyPadType=keyPadType;
	}
	public boolean isHasRadio() {
		return hasRadio;
	}
	public void setHasRadio(boolean hasRadio) {
		this.hasRadio = hasRadio;
	}
	public boolean isHasBlueTooth() {
		return hasBlueTooth;
	}
	public void setHasBlueTooth(boolean hasBlueTooth) {
		this.hasBlueTooth = hasBlueTooth;
	}
	public boolean isHasInfraRed() {
		return hasInfraRed;
	}
	public void setHasInfraRed(boolean hasInfraRed) {
		this.hasInfraRed = hasInfraRed;
	}
	public boolean isHasMusicPlayer() {
		return hasMusicPlayer;
	}
	public void setHasMusicPlayer(boolean hasMusicPlayer) {
		this.hasMusicPlayer = hasMusicPlayer;
	}
	public boolean isHasTouchScreen() {
		return hasTouchScreen;
	}
	public void setHasTouchScreen(boolean hasTouchScreen) {
		this.hasTouchScreen = hasTouchScreen;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	public boolean isDataEnabled() {
		return isDataEnabled;
	}
	public void setDataEnabled(boolean isDataEnabled) {
		this.isDataEnabled = isDataEnabled;
	}
	public boolean isHasCamera() {
		return hasCamera;
	}
	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}
	public KeypadType getKeyPadType() {
		return keyPadType;
	}
	public void setKeyPadType(KeypadType keyPadType) {
		this.keyPadType = keyPadType;
	}
	
	public Model getModel() {
		return model;
	}
	@Override
	public String toString() {
		return "BasicPhone [hasRadio=" + hasRadio + ", hasBlueTooth=" + hasBlueTooth + ", hasInfraRed=" + hasInfraRed
				+ ", hasMusicPlayer=" + hasMusicPlayer + ", hasTouchScreen=" + hasTouchScreen + ", hasWifi=" + hasWifi
				+ ", isDataEnabled=" + isDataEnabled + ", hasCamera=" + hasCamera + ", model=" + model + ", keyPadType="
				+ keyPadType + "]";
	}
	
}
