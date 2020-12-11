package com.api.hackerrank.basicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_Content_Extractor {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String regex = "<(.+)>([^<]+)</\\1>";
		Pattern pattern = Pattern.compile(regex);
		int testCases = Integer.valueOf(bufferedReader.readLine());
		while (testCases-- > 0) {
			int found = 0;
			String tags = bufferedReader.readLine();
			Matcher matcher = pattern.matcher(tags);
			while (matcher.find()) {
				System.out.println(matcher.group(2));
				System.out.println(matcher.group(1));
				System.out.println(matcher.group(0));
				found = 1;
			}
			if (found == 0) {
				System.out.println("None");
			}
		}
	}

}
