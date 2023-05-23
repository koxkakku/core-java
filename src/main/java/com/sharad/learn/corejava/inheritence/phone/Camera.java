package com.sharad.learn.corejava.inheritence.phone;

public class Camera implements Icamera {

	@Override
	public void record() {
		System.out.println("Video recording");

	}

	@Override
	public void click() {
		System.out.println("Photo captured");

	}

}
