package com.api.hackerrank.basicJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		for (int iter = 0; iter < num; iter++) {
			String name = scanner.nextLine();
			int number = scanner.nextInt();
			scanner.nextLine();
			phoneBook.put(name, number);
		}
		while (scanner.hasNext()) {
			String n = scanner.nextLine();
			if (phoneBook.get(n) != null) {
				System.out.println(n + "=" + phoneBook.get(n));
			} else {
				System.out.println("Not found");
			}
		}
		scanner.close();
	}

}
