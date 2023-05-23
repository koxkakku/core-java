package com.sharad.learn.corejava.stack;

public class StackUnderflowException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -714434378859881519L;

	public StackUnderflowException() {
		super("Stack is Empty.You can not delete any element ");
	}

}
