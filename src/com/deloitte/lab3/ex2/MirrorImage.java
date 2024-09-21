package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.next();
		System.out.println("Mirror image: " + getImage(s));
		sc.close();
	}

	public static String getImage(String str) {
		StringBuilder s = new StringBuilder(str);
		String reversedString = s.reverse().toString();
		return str + "|" + reversedString;
	}

}
