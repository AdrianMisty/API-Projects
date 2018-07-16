// Name : AdrianMisty
// 07-01-2018

import java.text.DecimalFormat;
import org.jibble.pircbot.*;

public class BotChat extends PircBot {
	
	public BotChat(){
		this.setName("TalkToThisChatBot");
	}
	//checks message and then does the following
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		if(message.equalsIgnoreCase("weather")|| message.contains("weather")){
			TestAPI.city = "Galveston";
			//calling WeatherAPI's main method
			TestAPI.main(null);
			//format temperature 
			DecimalFormat df = new DecimalFormat("#.##");
			String cur = df.format(TestAPI.parseJson(TestAPI.answer.toString()));
			sendMessage(channel, " : Weather : The current temperature is : "+ cur + " °F." );
		}
		if (message.equalsIgnoreCase("time")|| message.contains("time")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel, sender + ": The time is " + time);
	    }
		if (message.equalsIgnoreCase("hello")|| message.contains("Hi")|| message.contains("Hello")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel,"Hello! "+ sender);
	    }
		if (message.equalsIgnoreCase("WOAH")|| message.contains("woah")|| message.contains("Woah")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel,"Woah! yourself, "+ sender);
	        }
	    if (message.equalsIgnoreCase("hey")|| message.contains("What's up")|| message.contains("Hey")) {
		        String time = new java.util.Date( ).toString( );
		        sendMessage(channel,"You best watch yourself, "+ sender);    
	}
}}
