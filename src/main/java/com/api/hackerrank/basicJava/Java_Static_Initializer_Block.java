package com.api.hackerrank.basicJava;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

	static Scanner input;
	static boolean flag = true;
	static int B;
	static int H;
	static {
		input = new Scanner(System.in);
		B = input.nextInt();
		H = input.nextInt();
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}
}
