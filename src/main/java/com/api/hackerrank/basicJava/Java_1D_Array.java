package com.api.hackerrank.basicJava;

import java.util.Scanner;

public class Java_1D_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int iter = 0; iter < n; iter++) {
			a[iter] = scan.nextInt();
		}
		scan.close();
		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}