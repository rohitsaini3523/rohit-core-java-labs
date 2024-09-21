package com.deloitte.lab2.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("\nEnter the elements of array: ");
		int temp;
		for (int i = 0; i < n; i++) {
			temp = sc.nextInt();
			a[i] = temp;
		}
		System.out.println("Second largest element is : " + getSecondSmallest(a));
		sc.close();
	}

	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}

}
