package kipohaDS.Listeners.SlashCommands.SlashCallback;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

import java.time.Duration;

public class Mute {
    public void callback(SlashCommandInteractionEvent event) {
        OptionMapping optionMember = event.getOption("member");
        OptionMapping optionTime = event.getOption("time");
        OptionMapping optionReason = event.getOption("reason");
        Member member = optionMember.getAsMember();
        int time = optionTime.getAsInt();
        member.timeoutFor(Duration.ofMinutes(time)).queue();
        String reason = optionReason.getAsString();
        event.reply("Member " + member.getNickname() + " is muted for " + time + " minutes!\n" + "Reason: " + reason).setEphemeral(true).queue();
        member.getUser().openPrivateChannel().queue(channel -> {
            try {
                channel.sendMessage("You have been muted for " + time + " minutes.\nReason: " + reason).queue();
            } catch (Exception e) {}
        });
    }
}
