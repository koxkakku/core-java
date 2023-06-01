/**
 * 
 */
/**
 * @author koxkakku
 *
 */
package com.sharad.learn.corejava.basic.designpattern.creational.builder;

public class PackageInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder aboutSingletonDesignPattern = new StringBuilder(
				"Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes")
				.append("\n")
				.append("Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument")
				.append("\n")
				.append("Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL")
				.append("\n")
				.append("If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing")
				.append("\n")
				.append("Singleton design pattern is used in core Java classes also (for example, java.lang.Runtime, java.awt.Desktop).")
				.append("\n").append("Builder Design Pattern in Java").append("\n")
				.append("First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.")
				.append("\n")
				.append("Java Builder class should have a public constructor with all the required attributes as parameters")
				.append("\n")
				.append("Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.")
				.append("\n")
				.append("The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument")
				.append("\n");
		System.out.println(aboutSingletonDesignPattern);
	}
}