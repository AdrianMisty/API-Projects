/*Name : Adriana Alva
 *Class : 2336
 * */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;

public class BookAPI
{
	static String isbn;
	static StringBuilder answer;
	public static void main(String[] args) {
		WeatherRequest("Dallas");
		
	}
	
	static String WeatherRequest(String isbn){
		String weatherURL = "https://www.googleapis.com/books/v1/volumes?q=isbn";
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
		    	while ((line = rd.readLine()) != null) { 
		    		answer.append(line);
		    	}
		    rd.close();
		    //what do we want to search the API for? how many books are in database
		    System.out.print("The total number of books in this database is ");
		    int temp = parseJson(answer.toString());
		    System.out.print( + temp + ".");
		     return answer.toString();
		}
		catch(Exception e){return "Error! Exception: " + e;}
	}
	// total number of books 
	static int parseJson(String json) {
        JsonElement jelem = new JsonParser().parse(json);
        JsonObject  books = jelem.getAsJsonObject();
       // JsonObject mainObj = MasterWeatherObj.getAsJsonObject("total items"); 
        int totalbooks = books.get("totalItems").getAsInt(); 
       // double temp = tempmin * 9 / 5 - 459.67;
        
	return totalbooks;
}   
	// return a cool book title
	static String parseJsonRead(String json) {
       String result = null;
		JsonElement jelem = new JsonParser().parse(json);
        JsonObject jem = jelem.getAsJsonObject();
        JsonArray item = jem.getAsJsonArray("items");
        for (int i = 0; i < item.size(); i++) {
            JsonObject jsonObject1 = (JsonObject) item.get(i);//3
            JsonArray jsonarray1 = (JsonArray) jsonObject1.get("volumeInfo");
            for (int j = 0; j < jsonarray1.size(); j++) {
                result = (((JsonObject) jsonarray1.get(j)).get("title").toString());//5
             }
	    }
        return result;    
  }
}