package com.api.hackerrank.string;

public class Splitter {
	public static void main(String[] args) {
		String str = "Destroy the system that created it. You should have trusted me to finish the job.";
		String[] s = str.split("");
		for (String ss : s) {
			System.out.print(ss);
		}
	}

}
