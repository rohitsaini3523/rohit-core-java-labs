package com.deloitte.lab2.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

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
		a = modifyArray(a);

		System.out.print("\nArray element after removing duplicates: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		sc.close();
	}

	public static int[] modifyArray(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int newSize = set.size();
		List<Integer> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list, Collections.reverseOrder());
		set.clear();
		int[] uniqueElements = new int[newSize];
		int k = 0;
		for (Integer i : list) {
			uniqueElements[k++] = i;
		}
		return uniqueElements;

	}

}
