package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.print("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Prime Numbers till: ");
		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + ", ");
			}
		}
		sc.close();
	}

}
