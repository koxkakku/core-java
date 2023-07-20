package com.sharad.learn.corejava.basic;

import java.util.Scanner;
/**
 * @author koxkakku
 */
public class UserNameValidation {

	public static void main(String[] args) {
		final String regularExpression = "^[a-zA-Z](\\w{7,29})$";
		Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        scan.close();
        if (userName.matches(regularExpression)) {
        	System.out.println("Valid");
        } else {
        	System.out.println("Invalid");
        }           

	}
}
