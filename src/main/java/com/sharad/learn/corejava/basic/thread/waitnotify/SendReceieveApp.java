package com.sharad.learn.corejava.basic.thread.waitnotify;

public class SendReceieveApp {
	public static void main(String[] args) throws InterruptedException {
	    Data data = new Data();
	    Thread sender = new Thread(new Sender(data));
	    Thread receiver = new Thread(new Receiver(data));
	    
	    sender.start();
	    Thread.sleep(1000);
	    receiver.start();
	}
}
