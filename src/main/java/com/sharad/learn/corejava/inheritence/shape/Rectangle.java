package com.sharad.learn.corejava.inheritence.shape;

public class Rectangle implements Shape{
	private double breadth;
	private double length;

	public Rectangle(Double breadth, Double length) {
		this.breadth=breadth;
		this.length= length;
	}
	@Override
	public void perimeter() {
		System.out.println(String.format("Perimeter of Rectangle is %d ", 2*(this.length+this.breadth)));
	}
	@Override
	public void area() {
		System.out.println(String.format("Area of Rectangle is %d ", this.length*this.breadth));
	}

	@Override
	public void draw() {
		System.out.println(String.format("Rectangle with bredth=%d and length= %d is drawn",this.breadth,this.length));
	}
}