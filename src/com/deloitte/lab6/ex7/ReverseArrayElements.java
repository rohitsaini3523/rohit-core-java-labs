package com.deloitte.lab6.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArrayElements {

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
		a = getSorted(a);
		System.out.print("\nArray element reversed and sorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}		
		sc.close();
	}

	public static int[] getSorted(int[] arr) {
		int n = arr.length;
		List<String> temp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Integer t = arr[i];
			StringBuilder str = new StringBuilder(t.toString());
			str.reverse();
			temp.add(str.toString());
		}
		List<Integer> newList = new ArrayList<>();
		temp.forEach(s -> {
			newList.add(Integer.parseInt(s));
		});
		Collections.sort(newList);
		for(int i = 0; i<n; i++) {
			arr[i] = newList.get(i);
		}
		return arr;
	}

}