package com.deloitte.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string array size: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		String temp;
		for (int i = 0; i < n; i++) {
			temp = sc.next();
			arr[i] = temp;
		}
		arr = sortString(arr);
		System.out.print("\nsorted string array: ");
		for (int i = 0; i < arr.length; i++) {
			if ((i < n / 2) || (n % 2 != 0 && i <= n / 2))
				System.out.print(arr[i].toUpperCase() + ", ");
			else
				System.out.print(arr[i].toLowerCase() + ", ");
		}
		sc.close();
	}

	public static String[] sortString(String[] arr) {
		Arrays.sort(arr);
		return arr;
	}

}
