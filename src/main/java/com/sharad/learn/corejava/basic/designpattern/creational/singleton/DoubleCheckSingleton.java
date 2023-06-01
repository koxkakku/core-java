package com.sharad.learn.corejava.basic.designpattern.creational.singleton;
/**
 * 
 * @author koxkakku
 * 
 * double-checked locking principle
 * the synchronized block is used inside the if condition with 
 * an additional check to ensure that only one instance of a singleton class is created
 * 
 * not recommended as synchronized method performance has improved a lot in newer JVMs, so this is now a preferred solution. If you prefer to avoid using synchronized altogether, you can use an inner static class to hold the reference instead. 
 * Inner static classes are guaranteed to load lazily.
 *
 */
public class DoubleCheckSingleton {
	private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){
    	
    }
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
    
}
