package com.sharad.learn.corejava.basic;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
/**
 * @author koxkakku
 */
public class DeteTimeDemo {
	public static void main(String[] args) {
		
		Calendar.getAvailableCalendarTypes().forEach(System.out::println);
		Calendar cal = Calendar.getInstance(new Locale("EN", "IN"));
		cal.set(1987, 11, 27);
		cal.getTime().toInstant();
		LocalDate parsedDate = LocalDate.parse("27/12/1987", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(
				parsedDate.getMonth().
				getDisplayName(TextStyle.FULL, new Locale("EN", "IN")));
		System.out.println(parsedDate.format(DateTimeFormatter.ofPattern("yy-dd-MM")));
		System.out.println(parsedDate.getDayOfYear());
		System.out.println(parsedDate.getMonth());
		System.out.println(parsedDate.getDayOfWeek());
		Time t = Time.valueOf(LocalTime.parse("27/12/1987", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(t);
	}
}
