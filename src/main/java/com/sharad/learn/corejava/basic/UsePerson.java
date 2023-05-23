package com.sharad.learn.corejava.basic;

public class UsePerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Rahul Dravid");
		p.setDateOfBerth("12 January 1998");
		p.setGender("Male");
		p.setCountry("India");
		Work w = new Work();
		w.job(p, "Morning");
	}
}
