package com.deloitte.lab3.ex1;

import java.util.Scanner;

public class StringInputSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lines of integer: ");
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int sum = 0;
		for (String s : arr) {
			sum += Integer.parseInt(s);
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}

}
