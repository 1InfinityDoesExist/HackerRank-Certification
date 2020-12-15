package com.api.hackerrank.basicJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for (int iter = 0; iter < num; iter++) {
			ArrayList<Integer> data = new ArrayList<Integer>();
			int dataNum = input.nextInt();
			for (int jter = 0; jter < dataNum; jter++) {
				data.add(input.nextInt());
			}
			arr.add(data);
		}

		int testCases = input.nextInt();
		for (int iter = 0; iter < testCases; iter++) {
			int row = input.nextInt();
			int col = input.nextInt();
			if (row > 0 && row <= arr.size()) {
				ArrayList<Integer> array = arr.get(row - 1);
				if (col > 0 && col <= array.size()) {
					System.out.println(array.get(col - 1));
				} else {
					System.out.println("ERROR!");
				}
			}
		}
		input.close();
	}
}