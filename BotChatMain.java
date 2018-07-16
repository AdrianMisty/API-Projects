// Name : AdrianMisty
// 07-01-2018
import org.jibble.pircbot.*;

public class BotChatMain {
	
	public static void main(String[] args) throws Exception{
		//start bot up
		BotChat bot = new BotChat();
		//enable debugging output
		bot.setVerbose(true);
		//connect to the IRC server
		bot.connect("irc.freenode.net");
		//join the #pircbot channel
		bot.joinChannel("#pircbot");

	}
}
