package com.api.hackerrank.apicertification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Solution {

	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String competition = bufferedReader.readLine();
//		int year = Integer.parseInt(bufferedReader.readLine().trim());
//		int result = Result.getWinnerTotalGoals(competition, year);
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//		bufferedReader.close();
//		bufferedWriter.close();
//		
		String competition = "cc";
		int year = 2014;
		int result1 = Result.getWinnerTotalGoals(competition, year);
		int result2 = Result.getNumDraws(year);

	}
}
