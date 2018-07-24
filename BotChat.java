/*Name : Adriana Alva
 *Date started : 6/25/2018
 *Date Finished: 7/23/2018
 *Class : 2336
 * */

import java.text.DecimalFormat;
import org.jibble.pircbot.*;

public class BotChat extends PircBot {

	public BotChat() {
		this.setName("TalkToThisChatBot");
	}

	// checks message and then does the following
	public void onMessage(String channel, String sender, String login, String hostname, String message) {
        // WEATHER API
		if (message.equalsIgnoreCase("weather") || message.contains("weather") || message.contains("Dallas")
				|| message.equalsIgnoreCase("dallas")) {
			WeathAPI.city = "Dallas";
			// calling WeatherAPI's main method
			WeathAPI.main(null);
			// format temperature
			DecimalFormat df = new DecimalFormat("#.##");
			String cur = df.format(WeathAPI.parseJson(WeathAPI.answer.toString()));
			sendMessage(channel, " The current temperature in Dallas is : " + cur + " °F.");
		}
		if (message.equalsIgnoreCase("Richardson") || message.contains("Richardson") || message.contains("UTD")) {
			WeathAPI.city = "Richardson";
			// calling WeatherAPI's main method
			WeathAPI.main(null);
			// format temperature
			DecimalFormat df = new DecimalFormat("#.##");
			String cur = df.format(WeathAPI.parseJson(WeathAPI.answer.toString()));
			sendMessage(channel, " The current temperature in Richardson is : " + cur + " °F.");
		}
		if (message.equalsIgnoreCase("UTD") || message.contains("UTD") || message.contains("UTD")) {
			WeathAPI.city = "Richardson";
			// calling WeatherAPI's main method
			WeathAPI.main(null);
			// format temperature
			DecimalFormat df = new DecimalFormat("#.##");
			String cur = df.format(WeathAPI.parseJson(WeathAPI.answer.toString()));
			sendMessage(channel, " The current temperature on UTD campus is : " + cur + " °F. Woosh!");
		}
		if (message.equalsIgnoreCase("Plano") || message.contains("Plano") || message.contains("plano")) {
			WeathAPI.city = "Plano";
			// calling WeatherAPI's main method
			WeathAPI.main(null);
			// format temperature
			DecimalFormat df = new DecimalFormat("#.##");
			String cur = df.format(WeathAPI.parseJson(WeathAPI.answer.toString()));
			sendMessage(channel, " The current temperature in Plano is : " + cur + " °F.");
		}
		//GOOGLE BOOKS API
		if (message.equalsIgnoreCase("google") || message.contains("Book") || message.contains("book")
				|| message.equalsIgnoreCase("Book")) {
			BookAPI.isbn = "1";
			// calling WeatherAPI's main method
			BookAPI.main(null);
			// format temperature
			int cur = (BookAPI.parseJson(BookAPI.answer.toString()));
			sendMessage(channel, "Google books has a total of " + cur +" books.");
		}
		if (message.equalsIgnoreCase("read") || message.contains("read") || message.contains("reading")
				|| message.equalsIgnoreCase("reading")) {
			BookAPI.isbn = "0";
			// calling WeatherAPI's main method
			BookAPI.main(null);
			// format temperature
			String title = (BookAPI.parseJsonRead(BookAPI.answer.toString()));
			sendMessage(channel, "Maybe consider reading one of the several books I found it through Google Books.Such as " + title);
		}
		// TIME
		if (message.equalsIgnoreCase("time") || message.contains("time")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, sender + ": The time is " + time);
		}
		// CHAT BOT RESPONSES
		if (message.equalsIgnoreCase("hello") || message.contains("Hi") || message.contains("Hello")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, "Hello! " + sender);
		}
		if (message.equalsIgnoreCase("WOAH") || message.contains("woah") || message.contains("Woah")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, "Woah! yourself, " + sender);
		}
		if (message.equalsIgnoreCase("hey") || message.contains("What's up") || message.contains("Hey")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, "You best watch yourself, " + sender);
		}
		if (message.equalsIgnoreCase("how is it going") || message.contains("How are you")
				|| message.contains("como estas")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, "I am doing as much as a bot can right now. How are you? " + sender);
		}
		if (message.equalsIgnoreCase("good") || message.contains("im doing great") || message.contains("im okay")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, "Cool. " + sender);
		}
		//TWITTER API
        	// if anyone sends a message that contains twitter 
			//ISSUE : KEY COMBO already set ????
		/*
		 * if(message.equalsIgnoreCase("twitter") || message.contains("twitter") ||
		 * message.matches("twitter") ) ){
		 *  TwitterAPI.main(null); //sends message to the server with twitter names and statuses
		 *  for(int i = 0; i < TwitterAPI.names.size(); i++){
		 *            sendMessage(channel, sender + " Twitter user @" + TwitterAPI.names.get(i) +
		 * " tweeted: " + TwitterAPI.stats.get(i)); }
		 */
	   }
   
}