package com.sharad.learn.corejava.basic.findcity;

public class CityNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4317586480851586527L;

	public CityNotFoundException(String messageForUser) {
		super(messageForUser);
	}

}