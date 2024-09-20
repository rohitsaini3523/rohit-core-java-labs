package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth place: ");
		int n = sc.nextInt();
		System.out.println("(Recursice function) Value at the " + n + " place is :" + fibonacciRecursive(n));
		System.out.println("Value at the " + n + " place is :" + fibonacci(n));
		sc.close();
	}

	public static int fibonacciRecursive(int n) {
		if (n < 1)
			return 0;
		if (n == 2 || n == 1)
			return 1;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public static int fibonacci(int n) {
		int n1 = 1, n2 = 1;
		int ans = 1;
		for (int i = 2; i < n; i++) {
			ans = n1 + n2;
			n1 = n2;
			n2 = ans;
		}
		return ans;

	}
}
