package com.sharad.learn.corejava.basic.thread.waitnotify;

public class Data {
    private String packet;
    
    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;
 
    public synchronized String receive() {
    	System.out.println("Receiving transfer: "+String.valueOf(transfer));
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted");
            }
        }
        transfer = true;
        String returnPacket = packet;
        notifyAll();
        System.out.println("Received : "+returnPacket);
        System.out.println("Receiving transfer : "+String.valueOf(transfer));
        return returnPacket;
    }
 
    public synchronized void send(String packet) {
    	System.out.println("Sending transfer : "+String.valueOf(transfer));
        while (!transfer) {
            try { 
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted");
            }
        }
        transfer = false;
        this.packet = packet;
        notifyAll();
        System.out.println("Sent : "+packet);
        System.out.println("Sending transfer : "+String.valueOf(transfer));
    }
}