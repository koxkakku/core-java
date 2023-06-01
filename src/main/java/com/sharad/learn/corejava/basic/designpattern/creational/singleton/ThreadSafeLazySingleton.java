package com.sharad.learn.corejava.basic.designpattern.creational.singleton;
/**
 * 
 * @author koxkakku
 * 
 * global access method synchronized so that only one thread can execute this method at a time. 
 * provides thread-safety,
 * 
 * recommended way.
 *
 */
public class ThreadSafeLazySingleton {
	private static ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton(){
    	System.out.println("thread safe lazy singleton");
    }

    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }

}
