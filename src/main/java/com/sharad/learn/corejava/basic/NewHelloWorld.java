package com.sharad.learn.corejava.basic;

public class NewHelloWorld {
	private interface Greeting{
		void greet(String greetMsg);
	}
	public static void main(String[] args) {
		Greeting g = System.out::println;
		g.greet("Hello there!!");
	}

}

