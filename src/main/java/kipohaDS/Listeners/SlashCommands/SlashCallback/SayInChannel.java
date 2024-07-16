package kipohaDS.Listeners.SlashCommands.SlashCallback;

import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public class SayInChannel {
    public void callback(SlashCommandInteractionEvent event){
        OptionMapping channelOption = event.getOption("channel");
        if (channelOption != null && channelOption.getChannelType() == ChannelType.TEXT) {
            TextChannel channel = channelOption.getAsChannel().asTextChannel();
            String content = event.getOption("content").getAsString();
            channel.sendMessage(content).queue();
            event.reply("success!").setEphemeral(true).queue();
        } else {
            event.reply("Say In Channel not found or is not a text channel").queue();
        }
    }
}
