/**
 * 
 */
package com.sharad.learn.corejava.basic.designpattern.creational.singleton;

/**
 * @author koxkakku
 * 
 * In eager initialization, the instance of the singleton class is created at the time of class loading.
 * The drawback to eager initialization is that 
 * the method is created even though the client application might not be using it
 * 
 * not recommended
 *
 */
public class StaticInitializerSingleton {
	private static final StaticInitializerSingleton instance = new StaticInitializerSingleton();

    // private constructor to avoid client applications using the constructor
    private StaticInitializerSingleton(){
    	System.out.println("static initialized singleton");
    }

    public static StaticInitializerSingleton getInstance() {
        return instance;
    }
}
