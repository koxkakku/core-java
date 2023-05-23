package com.sharad.learn.corejava.inheritence.shape;

public class Circle implements Shape{
	private double radius;

	public Circle(Double r) {
		this.radius=r;
	}
	@Override
	public void perimeter() {
		System.out.println(String.format("Circumference of Circle is %d ", 2*3.14*this.radius ));
		
	}
	@Override
	public void area() {
		System.out.println(String.format("Area of Circle is %d ",3.14*this.radius*this.radius));
	}

	@Override
	public void draw() {
		System.out.println(String.format("Circle with radius %d is drawn", this.radius));
		
	}
}