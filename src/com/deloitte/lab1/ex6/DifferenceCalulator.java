package com.deloitte.lab1.ex6;

import java.util.Scanner;

public class DifferenceCalulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		calculateDifference(n);
		sc.close();
	}

	public static void calculateDifference(int n) {
		System.out.println("Difference between the sum of the squares and square of the sum is: "
				+ (sumOfSquare(n) - squareOfSum(n)));
	}

	public static int squareOfSum(int n) {
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += i;
		}
		return ans * ans;
	}

	public static int sumOfSquare(int n) {
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += (i * i);
		}
		return ans;
	}

}
