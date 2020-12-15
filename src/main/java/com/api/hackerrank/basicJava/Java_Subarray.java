package com.api.hackerrank.basicJava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Subarray {
	public static void main(String[] args) throws IOException, NumberFormatException {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		while (num-- > 0) {
			arr.add(input.nextInt());
		}
		input.close();
		int count = 0;
		// for single value
		for (int iter = 0; iter < arr.size(); iter++) {
			if (arr.get(iter) < 0) {
				count++;
			}
		}
		// for double value
		for (int kter = 2; kter <= arr.size(); kter++) {
			for (int iter = 0; iter <= arr.size() - kter; iter++) {
				int add = 0;
				for (int jter = iter; jter <= iter + kter - 1; jter++) {
					add = add + arr.get(jter);
				}
				if (add < 0) {
					count++;
				}
			}
		}

		// second way, using only two for loop
		int sum = 0;
		for (int iter = 0; iter < arr.size(); iter++) {
			for (int jter = iter; jter < arr.size(); iter++) {
				sum += arr.get(jter);
				if (sum < 0) {
					count++;
				}
			}
			sum = 0;
		}
		System.out.println(count);
	}
}
