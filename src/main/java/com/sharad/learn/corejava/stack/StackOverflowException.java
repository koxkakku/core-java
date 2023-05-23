package com.sharad.learn.corejava.stack;

public class StackOverflowException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4877984840221304936L;

	public StackOverflowException() {
		super("Stack is Full.You can not add any element");
	}

}
