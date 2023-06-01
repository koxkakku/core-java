/**
 * 
 */
package com.sharad.learn.corejava.basic.designpattern.creational.abstractfactory;

/**
 * @author koxkakku
 *
 */
public class ComputerFactory {
	private ComputerFactory() {
		
	}
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
