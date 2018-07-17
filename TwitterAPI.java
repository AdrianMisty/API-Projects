//Name : Adriana Alva
//Date : 7-6-2018
import java.util.ArrayList;
import twitter4j.*;
import twitter4j.auth.AccessToken;

public class TwitterAPI {
	//static variables we will be using
	static ResponseList<Status> statuses;
	static ArrayList<String> stats;
	static ArrayList<String> names;
	public static void main(String[] args){
		//OAuth.com tokens 
	Twitter twitter = new TwitterFactory().getInstance();
	twitter.setOAuthConsumer("zzzbchYL7x58V2fRnyUZa2wWI","TSVYHCZhy8p1xJcuYR64nAsgr8P5YfsNzaI63AKfijKLsgBGUl");		
	twitter.setOAuthAccessToken(new AccessToken());
		
	try {
            //verify my credentials
            User koala = twitter.verifyCredentials();
            ResponseList<Status> statuses = twitter.getHomeTimeline();
            //using arraylists to  send messages easier
            stats = new ArrayList<String>();
			names = new ArrayList<String>();
            for (Status s : statuses) {
              names.add(s.getUser().getScreenName());
              stats.add(s.getText());
            }
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Attempt Failed: " + te.getMessage());
            System.exit(-1);
        }
	}
}
