package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Regex_2_Duplicate_Words {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String regex = "\\b(\\w+)(\\s+\\1\\b)*";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		int testCases = Integer.valueOf(bufferedReader.readLine());
		while (testCases-- > 0) {
			String sentence = bufferedReader.readLine();
			Matcher m = p.matcher(sentence);
			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				System.out.println(m.group(0));
				System.out.println(m.group(1));
				System.out.println(m.group(2));
				sentence = sentence.replaceAll(m.group(0), m.group(1));
			}
			System.out.println(sentence);
		}
		bufferedReader.close();
	}
}
