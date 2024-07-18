package kipohaDS;

import kipohaDS.config.Bot;
import kipohaDS.config.Tokens;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

public class Main {
    public static void main(String[] args) {
        try {
            JDA bot = new Bot().buildBot();bot.awaitReady();
            TextChannel channel = bot.getTextChannelById(new Tokens().getChannelId());
            channel.sendMessage("Test Java").queue();
            System.out.println("Bot started!");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}