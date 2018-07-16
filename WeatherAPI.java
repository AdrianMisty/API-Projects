// Name :Adriana Alva
// Weather API 
// 6/28/2018 - 7/14/2018

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherAPI {
	static String city;
	static StringBuilder answer;

	public static void main(String[] args) {
		try {
            // user inputs city name to find it's current weather data
			String weatherURL = "https://samples.openweathermap.org/data/2.5/weather?q=" + city + ",us&appid=b6907d289e10d714a6e88b30761fae22";
			answer = new StringBuilder();
			URL url = new URL(weatherURL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader woot = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = woot.readLine()) != null) {
				answer.append(line);
			}
			woot.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Current Temperature
	static double parseTemp(String json) {
		JsonElement jelement = new JsonParser().parse(json);
		JsonObject MasterWeatherObject = jelement.getAsJsonObject();
		JsonObject mainObject = MasterWeatherObject.getAsJsonObject("main");
		double temp = mainObject.get("temp").getAsDouble();
		double tempF = temp * 9 / 5 - 459.67;
		// Double minT = minTempF;
		return tempF;
	}

}