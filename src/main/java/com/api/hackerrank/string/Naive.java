package com.api.hackerrank.string;

public class Naive {
	public static void main(String[] args) {
		String str = "Destroy the system that created it. You should have trusted me to finish the job.";

		for (int iter = 0; iter < str.length(); iter++) {
			System.out.print(str.charAt(iter));
		}

	}
}
