package com.api.hackerrank.basicJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		List<Integer> data = new ArrayList<Integer>();
		for (int iter = 0; iter < num; iter++) {
			data.add(scanner.nextInt());
		}
		int testCases = scanner.nextInt();
		while (testCases-- > 0) {
			String task = scanner.next();
			if (task.equals("Insert")) {
				int pos = scanner.nextInt();
				int value = scanner.nextInt();
				if (pos >= 0 && pos <= data.size()) {
					data.add(pos, value);
				}
			}
			if (task.equals("Delete")) {
				int pos = scanner.nextInt();
				if (pos >= 0 && pos < data.size()) {
					data.remove(pos);
				}
			}
		}
		scanner.close();
		for (int iter = 0; iter < data.size(); iter++) {
			System.out.print(data.get(iter) + " ");
		}
		data.clear();
	}
}
