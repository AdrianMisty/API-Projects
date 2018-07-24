import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class PokeAPI
{
	static String city;
	static StringBuilder answer;
	public static void main(String[] args) {
		PokeRequest("1");
		
	}
	
	static String PokeRequest(String city){
		String weatherURL = "http://pokeapi.co/api/v2/pokemon/1/";
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
		    System.out.println("Who's that pokemon? ");
		    
		   String poke = parseJson(answer.toString());
		    
		    System.out.println("It's " + poke + "!");
		    
		    return answer.toString();
		}
		catch(Exception e){return "Error! Exception: " + e;}
	}

	static String parseJson(String json) {
		String x;
        JsonElement PokeLement = new JsonParser().parse(json);
        JsonObject  PokeObj = PokeLement.getAsJsonObject();
        JsonObject speciesObj = PokeObj.getAsJsonObject("form"); 
        String name = speciesObj.get("name").getAsString(); 
       
	return name;
}
	}
