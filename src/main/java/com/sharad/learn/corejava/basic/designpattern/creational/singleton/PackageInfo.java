/**
 * 
 */
package com.sharad.learn.corejava.basic.designpattern.creational.singleton;

/**
 * @author koxkakku
 *
 */
public class PackageInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder aboutSingletonDesignPattern = new StringBuilder(" Singleton Pattern Principles").append("\n")
		.append("Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.").append("\n")
		.append("The singleton class must provide a global access point to get the instance of the class.").append("\n")
				.append("Singleton pattern is used for logging, drivers objects, caching, and thread pool.").append("\n")
						.append("Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.").append("\n")
								.append("Singleton design pattern is used in core Java classes also (for example, java.lang.Runtime, java.awt.Desktop).").append("\n");
		System.out.println(aboutSingletonDesignPattern);
	}

}
