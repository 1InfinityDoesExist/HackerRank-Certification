package com.api.hackerrank.basicJava;

import java.io.IOException;
import java.util.Scanner;

public class Java_Output_Formatting {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String data1 = input.next();
			int data2 = input.nextInt();
			System.out.println(String.format("%-15s%03d", data1, data2));
		}
		input.close();
		System.out.println("================================");
	}
}
