package com.bridgelabz.Assignment;

import java.util.Scanner;

public class EqualCheck {

	public static void main(java.lang.String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = sc.nextLine();
		String b = sc.nextLine();

		if (a.equalsIgnoreCase(b)) {
			System.out.println("Both strings are equal.");
		} else {
			System.out.println("Both strings are not equal.");
		}

	}

}
