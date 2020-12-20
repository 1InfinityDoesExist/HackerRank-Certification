package com.api.hackerrank.string;

public class ToCharArray {

	public static void main(String[] args) {
		String str = "Destroy the system that created it. You should have trusted me to finish the job.";

		char[] charArray = str.toCharArray();
		for (Character ch : charArray) {
			System.out.print(ch);
		}
	}
}
