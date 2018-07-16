// Name : AdrianMisty
// 07-01-2018

import org.jibble.pircbot.*;
import java.text.DecimalFormat;

public class BotChat extends PircBot {
	
	public BotChat(){
		this.setName("TalkToThisChatBot");
	}
	//checks message and then does the following
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		//Weather API
		if(message.equalsIgnoreCase("weather")|| message.contains("weather")){
			WeatherAPI.city = "Galveston";
			//calling WeatherAPI's main method
			WeatherAPI.main(null);
			DecimalFormat df = new DecimalFormat("#.##");
			String Temperature = df.format(WeatherAPI.parseTemp(WeatherAPI.answer.toString()));
			sendMessage(channel, " : You wish to know the weather? : The current temperature is : "+ Temperature + " °F." );
		}
		//For Time
		if (message.equalsIgnoreCase("time")|| message.contains("time")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel, sender + ": The time is " + time);
	    }
		//Conversation
		if (message.equalsIgnoreCase("hello")|| message.contains("hello")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel,"Hello!, "+ sender);
	    }
		if (message.equalsIgnoreCase("what")|| message.contains("what")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel,"Good question!, "+ sender);
	}
}
