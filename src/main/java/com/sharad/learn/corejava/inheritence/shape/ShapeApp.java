package com.sharad.learn.corejava.inheritence.shape;

public class ShapeApp {
	public static void main(String[]args) {
		Shape shape=new Circle(10d);
		//calculating area and perimeter of circle
		shape.draw();
		shape.area();
		shape.perimeter();
		
		shape =new Rectangle(20d,45d);
		//calculating area and perimeter of Rectangle
		shape.draw();
		shape.area();
		shape.perimeter();
		
	}

}
