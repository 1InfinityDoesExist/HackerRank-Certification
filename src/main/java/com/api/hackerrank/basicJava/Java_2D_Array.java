package com.api.hackerrank.basicJava;

import java.util.Scanner;

public class Java_2D_Array {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int maxSize = Integer.MIN_VALUE;
		for (int iter = 1; iter < 5; iter++) {
			for (int jter = 1; jter < 5; jter++) {

				maxSize = Math.max(maxSize, arr[iter - 1][jter - 1] + arr[iter - 1][jter] + arr[iter - 1][jter + 1]
						+ arr[iter][jter] + +arr[iter + 1][jter - 1] + arr[iter + 1][jter] + arr[iter + 1][jter + 1]);

			}
		}
		System.out.println(maxSize);

		scanner.close();
	}
}
