/**
 * 
 */
package com.sharad.learn.corejava.basic.thread;

import java.util.Arrays;

/**
 * @author koxkakku
 *
 */
public class ThreadMethods {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ThreadSubClass t1 = new ThreadSubClass();
		ThreadSubClass t2 = new ThreadSubClass();
		t2.setName("New Thread @");
		System.out.println("thread state: "+ t2.getState());
		t2.start();
		Thread.interrupted();
		System.out.println("thread state after start(): "+ t2.getState());
		Thread.sleep(100);
		System.out.println("thread state after sleep() : "+ t2.getState());
		t2.start();
		System.out.println("thread state start after sleep : "+ t2.getState());
		
		System.out.println("thread state after interrupt() : "+ t2.getState());
		
	}

	
}

class ThreadSubClass extends Thread{
	public void run() {
		System.out.println("thread name: "+currentThread().getName()+"thread active count: "+activeCount());
	}
}
