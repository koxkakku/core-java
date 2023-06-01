package com.sharad.learn.corejava.basic.designpattern.creational.singleton;
/**
 * 
 * @author koxkakku
 * 
 * singleton class using an inner static helper class.
 *  private inner static class contains the instance of the singleton class. 
 *  When the SingletonFactory class is loaded, SingletonHelper class is not loaded into memory 
 *  and only when someone calls the getInstance() method, this class gets loaded and creates the singleton class instance
 *  
 *  This is the most widely used approach for the singleton class as it doesn’t require synchronization
 *
 */
public class SingletonFactory {
	private SingletonFactory(){
		System.out.println("private static inner class for instance creation");
	}

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
    	 return SingletonFactory.SingletonHelper.INSTANCE;
    }
    static class Singleton{
    	private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
    	private Singleton() {
    		
    	}
    }
       
}
