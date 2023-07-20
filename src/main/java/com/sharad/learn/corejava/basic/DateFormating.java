package com.sharad.learn.corejava.basic;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author koxkakku
 */
public class DateFormating {

	public static void main(String[] args) {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date); // 10-21-2022

	}

}
