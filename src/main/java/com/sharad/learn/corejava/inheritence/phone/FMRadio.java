/**
 * 
 */
package com.sharad.learn.corejava.inheritence.phone;

/**
 * @author koxkakku
 *
 */
public class FMRadio implements BasicMediaPlayer {

	public void close(){
		System.out.println("Exiting player");

	}
	public void changeStation() {
		System.out.println("Station Changed");
	}
	
}
