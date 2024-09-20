package com.deloitte.lab1.ex5;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth natural number: ");
		int n = sc.nextInt();
		System.out.println("Sum of first " + n + " which are divisible by 3 or 5 is: " + calculateSum(n));
		sc.close();

	}

	public static int calculateSum(int n) {
		int ans = 0;
		for (int i = 3; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				ans += i;
			}
		}
		return ans;
	}
}
