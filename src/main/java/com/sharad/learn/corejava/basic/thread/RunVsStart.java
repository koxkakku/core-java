/**
 * 
 */
package com.sharad.learn.corejava.basic.thread;

/**
 * @author koxkakku
 *
 */
public class RunVsStart {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("My Thread");
		// from sub-classing Thread class
		ChildThread ct = new ChildThread();
		ct.run();// runs like any other method as part the current thread//not recommended
		ct.start();// a separate thread starts

		// from class implementing runnable
		RunnableThread rt = new RunnableThread();
		rt.run();// runs as part of current thread// not recommended
		Thread t = new Thread(rt);
		t.run();// runs as part of current thread// not recommended
		t.start();// new thread started

	}

}

class ChildThread extends Thread {
	@Override
	public void run() {
		System.out.println("Good Morning: " + Thread.currentThread().getName());
	}
}

class RunnableThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Good Night: " + Thread.currentThread().getName());
	}
}
