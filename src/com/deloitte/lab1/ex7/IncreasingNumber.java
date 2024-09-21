package com.deloitte.lab1.ex7;

import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("is number increasing? " + checkNumber(n));
		sc.close();
	}

	public static boolean checkNumber(int n) {
		Integer num = n;
		String s = num.toString();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

}
