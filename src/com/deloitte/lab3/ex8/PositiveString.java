package com.deloitte.lab3.ex8;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the String: ");
		String s = sc.next();
		System.out.println("Is string positive? : " + isPositiveString(s));
		sc.close();
	}

	public static boolean isPositiveString(String s) {
		int len = s.length();
		for (int i = 0; i < len - 1; i++) {
			if (s.toLowerCase().charAt(i) <= s.toLowerCase().charAt(i + 1)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
