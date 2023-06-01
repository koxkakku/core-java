package com.sharad.learn.corejava.basic.designpattern.creational.singleton;
/**
 * 
 * @author koxkakku
 * 
 * Static block initialization implementation is similar to eager initialization, 
 * except that instance of the class is created in the static block that 
 * provides the option for exception handling.
 * static block initialization create the instance even before it’s being used
 * 
 * not recommended
 *
 */
public class StaticBlockInitializerSingleton {
	private static StaticBlockInitializerSingleton instance;

    private StaticBlockInitializerSingleton(){
    	System.out.println("static block initialized singleton");
    }

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockInitializerSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitializerSingleton getInstance() {
        return instance;
    }
}

