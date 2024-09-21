package com.deloitte.lab1.ex1;

import java.util.Scanner;

public class DigitCubeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		System.out.println("Sum of cube of digit of " + n + " : " + digitCubeSum(n));
		sc.close();
	}

	public static int digitCubeSum(int n) {
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			ans += Math.pow(rem, 3);
			n = n / 10;
		}
		return ans;
	}

}
