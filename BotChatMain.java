import org.jibble.pircbot.*;

public class BotChatMain {
	
	public static void main(String[] args) throws Exception{
		//connecting to the server
		BotChat bot = new BotChat();
		bot.setVerbose(true);
		bot.connect("irc.freenode.net");
		bot.joinChannel("#KhansClass");

	}
}