/*Name : Adriana Alva
 * Class : CS 2336
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeathAPI
{
	static String city;
	static StringBuilder answer;
	public static void main(String[] args) {
		WeatherGetter("Dallas");
		
	}
	
	static String WeatherGetter(String city){
		String weatherURL = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=2045126796536689aa40d7f7d49fd496";
		answer = new StringBuilder(); //will hold the java String after converting from JSON 
		double response = 200;
		try {	
			URL url = new URL(weatherURL); //the url we want to parse
			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //Used to make a single connection to that URL
			conn.setRequestMethod("GET"); //The Type of request we want to make
			System.out.println("\nSending 'GET' request to URL : " + url);
	        System.out.println("Response Code : " + response);
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream())); //pass in the instance of HttpURLConnection 
			String line;
		    	while ((line = rd.readLine()) != null) { //turn BufferedReader value into type String
		    		answer.append(line);
		    	}
		    rd.close();
		    //what do we want to search the API for?
		    System.out.println("Here is information for the weather within "+city);
		    double temp = parseJson(answer.toString());
		    System.out.println("Temperature is currently: " + temp + ".");
		     return answer.toString();
		}
		catch(Exception e){return "Error! Exception: " + e;}
	}
	//get temperature and change format
	static double parseJson(String json) {
        JsonElement jelem = new JsonParser().parse(json);
        JsonObject  MasterWeatherObj = jelem.getAsJsonObject();
        JsonObject mainObj = MasterWeatherObj.getAsJsonObject("main"); 
        double tempmin = mainObj.get("temp").getAsDouble(); 
        double temp = tempmin * 9 / 5 - 459.67;
        
	return temp;
}
	}