package com.kvaluent.assignment.eightjuly;

import java.util.HashMap;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		HashMap<String, String> credential = new HashMap<String, String>();
		credential.put("Ram", "ram");
		credential.put("Tinku", "tink");
		credential.put("Naveen", "nave");
		credential.put("Rishabh", "rish");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the username");
		String uname = sc.nextLine();
		System.out.println("enter the password");
		String pass = sc.nextLine();

		if (credential.containsKey(uname)) {
			System.out.println("username is correct");

		}
		if (credential.containsValue(pass)) {
			System.out.println("password is also correct");
		} else {
			System.out.println("error");

		}

	}

}