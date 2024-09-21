package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class AdjacentDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Difference between adjacent number is : " + modifyNumber(n));
		sc.close();
	}

	public static int modifyNumber(int num) {
		StringBuilder str = new StringBuilder();
		String input = String.valueOf(num);
		int size = input.length();
		for (int i = 1; i < size; i++) {
			int diff = (int) (input.charAt(i - 1) - input.charAt(i));
			str.append(Math.abs(diff));
		}
		return Integer.parseInt(str.toString());
	}
}
