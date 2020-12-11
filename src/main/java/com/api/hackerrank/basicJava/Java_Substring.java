package com.api.hackerrank.basicJava;

import java.util.Scanner;

public class Java_Substring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String data = scanner.next();
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		System.out.println(data.substring(start, end));
		scanner.close();
	}

}
