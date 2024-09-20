package com.deloitte.lab1.ex8;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		System.out.println("Is number power of 2? : " + isPowerOfTwo(n));
		sc.close();
	}

	public static boolean isPowerOfTwo(int n) {
		boolean ans = false;
		int check = 1;
		if (n == 1)
			return true;
		while (check < n) {
			check *= 2;
			if (check == n)
				return true;
		}
		return ans;
	}
}
