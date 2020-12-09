package com.api.hackerrank.apicertification;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Result {

	/*
	 * Get winner total Goals
	 */
	public static int getWinnerTotalGoals(String competition, int year)
			throws IOException, org.json.simple.parser.ParseException {
		competition = "UEFA%20Champions%20League";
		year = 2011;
		String endPoint = "https://jsonmock.hackerrank.com/api/football_competitions?name=UEFA%20Champions%20League&year=2011";
		StringBuffer buffer;
		int result = 0;
		URL url = new URL(endPoint);
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		httpURLConnection.setRequestMethod("GET");
		httpURLConnection.setReadTimeout(50000);
		httpURLConnection.setConnectTimeout(50000);
		httpURLConnection.setRequestProperty("Content-Type", "application/json");
		int status = httpURLConnection.getResponseCode();
		if (status == 200) {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(httpURLConnection.getInputStream()));
			String line;
			buffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
			}
			bufferedReader.close();
			httpURLConnection.disconnect();
			JSONObject jsonObject = (JSONObject) new JSONParser().parse(buffer.toString());
			JSONArray jsonArray = (JSONArray) jsonObject.get("data");
			String winningTeam = (String) ((JSONObject) jsonArray.get(0)).get("winner");
			System.out.println("::::::::winningTeam : " + winningTeam);
			String newUrl = "https://jsonmock.hackerrank.com/api/football_matches";
			int goalsAtHomeGround = getTotalGoals(
					String.format(newUrl + "?competition=%s&year=%d&team1=%s", competition, year, winningTeam), 1, 0,
					"team1");
			System.out.println(goalsAtHomeGround);
			int goalsAtForeignLand = getTotalGoals(
					String.format(newUrl + "?competition=%s&year=%d&team2=%s", competition, year, winningTeam), 1, 0,
					"team2");
			System.out.println(goalsAtForeignLand);
			result = goalsAtHomeGround + goalsAtForeignLand;
		}
		System.out.println("Final Result " + result);
		return result;
	}

	private static int getTotalGoals(String endPoint, int page, int total, String team)
			throws IOException, org.json.simple.parser.ParseException {
		StringBuffer buffer;
		System.out.println(":::::endPoint " + endPoint);
		URL url = new URL(endPoint + "&page=" + page);
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		httpURLConnection.setRequestMethod("GET");
		httpURLConnection.setReadTimeout(50000);
		httpURLConnection.setConnectTimeout(50000);
		httpURLConnection.setRequestProperty("Content-Type", "application/json");
		int status = httpURLConnection.getResponseCode();
		if (status == 200) {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(httpURLConnection.getInputStream()));
			String line;
			buffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line + "\n");
			}
			bufferedReader.close();
			httpURLConnection.disconnect();
			JSONObject jsonObject = (JSONObject) new JSONParser().parse(buffer.toString());
			JSONArray jsonArray = (JSONArray) jsonObject.get("data");
			System.out.println("jsonArray" + jsonArray);
			for (int iter = 0; iter < jsonArray.size(); iter++) {
				JSONObject obj = (JSONObject) jsonArray.get(iter);
				String goals = (String) obj.get(team + "goals");
				total += Integer.valueOf(goals);
			}
			System.out.println(String.format("page %s , totalPage %s", page, (long) jsonObject.get("total_pages")));
			if (page < (long) jsonObject.get("total_pages")) {
				getTotalGoals(endPoint, page + 1, total, team);
			}
		}
		return total;
	}

	/*
	 * Number of Draws
	 */
	public static int getNumDraws(int year) throws IOException, ParseException, org.json.simple.parser.ParseException {
		String endPoint = "https://jsonmock.hackerrank.com/api/football_matches?year=" + 2011;
		final int maxGoal = 10;
		int result = 0;
		for (int iter = 0; iter <= maxGoal; iter++) {
			result = result + getDrawCount(endPoint, iter);
		}
		System.out.println(":::::" + result);
		return result;
	}

	private static int getDrawCount(String endPoint, int iter)
			throws MalformedURLException, IOException, ParseException, org.json.simple.parser.ParseException {
		StringBuffer buffer;
		URL url = new URL(String.format(endPoint + "&team1goals=%d&team2goals=%d", iter, iter)); // we need only draw
																									// counts
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		httpURLConnection.setRequestMethod("GET");
		httpURLConnection.setReadTimeout(50000);
		httpURLConnection.setConnectTimeout(50000);
		httpURLConnection.setRequestProperty("Content-Type", "application/json");
		int status = httpURLConnection.getResponseCode();
		if (status == 200) {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(httpURLConnection.getInputStream()));
			String line;
			buffer = new StringBuffer();
			while ((line = bufferedReader.readLine()) != null) {
				buffer.append(line);
			}
			bufferedReader.close();
			httpURLConnection.disconnect();
			JSONObject jsonObject = (JSONObject) new JSONParser().parse(buffer.toString());
			return (int) (long) jsonObject.get("total");
		}
		return 0;
	}
}
