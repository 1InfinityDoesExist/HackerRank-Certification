package com.api.hackerrank.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String str = "Destroy the system that created it. You should have trusted me to finish the job.";

		StringTokenizer tokenizer = new StringTokenizer(str, str, true);
		while (tokenizer.hasMoreTokens()) {
			System.out.print(tokenizer.nextToken());
		}
	}
}
