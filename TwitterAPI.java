//Name : Adriana Alva
//Date started : 7-6-2018
//Date paused  : 7-15-2018
//Class : 2336
// Access token errors :(
import java.util.ArrayList;
import twitter4j.*;
import twitter4j.auth.AccessToken;

public class TwitterAPI {
	//variables we will be using
	static ResponseList<Status> status;
	//Arraylists for usernames & updates
	static ArrayList<String> update;
	static ArrayList<String> Username;
	
	public static void main(String[] args){	
		Twitter twitter = new TwitterFactory().getInstance();
		/* Error : java.lang.IllegalStateException: consumer key/secret pair already set ?
		twitter.setOAuthConsumer("zzzbchYL7x58V2fRnyUZa2wWI","TSVYHCZhy8p1xJcuYR64nAsgr8P5YfsNzaI63AKfijKLsgBGUl");
		twitter.setOAuthAccessToken(new AccessToken("1018891766999797762-3sp9qpysjLDSJW6ZENtfem194eZYZV","	Dz8vjcmY6q0qYD4RezLDWhHlED8MySDnsWXbJC2GTcabl" ));
			*/try {
            // verify my cred! 
            User user = twitter.verifyCredentials(); 
            ResponseList<Status> status = twitter.getHomeTimeline();
            update = new ArrayList<String>();
			Username = new ArrayList<String>();
			for (Status s : status) {  //name and updates
              Username.add(s.getUser().getScreenName());
              update.add(s.getText());
            }

        } catch (TwitterException twit) {
            twit.printStackTrace();
            System.out.println("Error : " + twit.getMessage());
            System.exit(-1);
        }
	}
}