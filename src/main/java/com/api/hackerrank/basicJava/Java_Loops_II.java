
package com.api.hackerrank.basicJava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Loops_II {
	public static void main(String[] args) throws IOException, NumberFormatException {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		List<Long> output = new ArrayList<Long>();
		for (int iter = 0; iter < num; iter++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			long data = a;
			for (int kter = 0; kter < c; kter++) {
				data += (long) ((Math.pow(2, kter)) * b);
				output.add(data);
			}
			output.stream().forEach(t -> {
				System.out.print(t + " ");
			});
			System.out.println();
			output.clear();
		}
		input.close();
	}
}
