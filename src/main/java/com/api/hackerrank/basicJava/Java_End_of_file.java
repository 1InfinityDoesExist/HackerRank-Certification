package com.api.hackerrank.basicJava;

import java.util.Scanner;

public class Java_End_of_file {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iter = 1;
		while (input.hasNext()) {
			System.out.println(iter++ + " " + input.nextLine());
		}
		input.close();
	}
}
