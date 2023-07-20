package com.sharad.learn.corejava.basic;
/**
 * @author koxkakku
 */
public class Work {
	public void job(Person person, String time) {
		switch (time) {
		case "Morning":
			System.out.println(person.toString() + "is doing breakfast");
			break;
		case "Day":
			System.out.println(person.toString() + "is in office");
			break;
		case "Evening":
			System.out.println(person.toString() + "is back at home");
			break;
		default:
			System.out.println(person.toString() + "is doing sleeping");
		}
	}
}
