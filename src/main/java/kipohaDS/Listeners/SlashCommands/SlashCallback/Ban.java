package kipohaDS.Listeners.SlashCommands.SlashCallback;

import kipohaDS.Listeners.SlashCommands.SlashCore;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

import java.util.concurrent.TimeUnit;

public class Ban extends SlashCore {
    @Override
    public void callback(SlashCommandInteractionEvent event) {
        OptionMapping optionMember = event.getOption("member");
        OptionMapping optionTime = event.getOption("time");
        OptionMapping optionReason = event.getOption("reason");
        Member member = event.getMember();
        String reason = optionReason.getAsString();
        int time = optionTime.getAsInt();
        member.ban(time, TimeUnit.DAYS).queue(
                success -> event.reply("ad").queue(),
                error -> event.reply("Something went wrong").queue()
        );
        member.getUser().openPrivateChannel().queue(
                channel -> {
                    channel.sendMessage("Banned").queue();
                }
        );
    }
}
