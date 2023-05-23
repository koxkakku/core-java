/**
 * 
 */
package com.sharad.learn.corejava.inheritence.phone;

import java.io.Closeable;

/**
 * @author koxkakku
 *
 */
public interface BasicMediaPlayer extends Closeable{
	default void play() {
		System.out.println("Started playing");
	}
	default void pause() {
		System.out.println("Paused playing");
	}
	default void stop() {
		System.out.println("Stopped Playing");
	}
}
