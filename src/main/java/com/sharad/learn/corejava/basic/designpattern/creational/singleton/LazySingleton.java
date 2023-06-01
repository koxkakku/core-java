package com.sharad.learn.corejava.basic.designpattern.creational.singleton;
/**
 * 
 * @author koxkakku
 * 
 * creates the instance in the global access method.
 *  works fine in the case of the single-threaded environment.
 *
 */
public class LazySingleton {
	private static LazySingleton instance;

    private LazySingleton(){
    	System.out.println("lazy singleton");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    
}
