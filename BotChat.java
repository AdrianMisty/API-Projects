import java.text.DecimalFormat;
import org.jibble.pircbot.*;

public class BotChat extends PircBot {
	
	public BotChat(){
		this.setName("TalkToThisChatBot");
	}
	//checks message and then does the following
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		if(message.equalsIgnoreCase("weather")|| message.contains("weather")){
			WeatherAPI.city = "Galveston";
			//calling WeatherAPI's main method
			WeatherAPI.main(null);
			//to only display two decimal points
			DecimalFormat df = new DecimalFormat("#.##");
			String cur = df.format(WeatherAPI.parseTemp(WeatherAPI.answer.toString()));
			sendMessage(channel, " : Weather : The current temperature is : "+ cur + " °F." );
		}
		if (message.equalsIgnoreCase("time")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel, sender + ": The time is " + time);
	    }
		if (message.equalsIgnoreCase("hello")) {
	        String time = new java.util.Date( ).toString( );
	        sendMessage(channel,"Hello! "+ sender);
	    }
	}
}