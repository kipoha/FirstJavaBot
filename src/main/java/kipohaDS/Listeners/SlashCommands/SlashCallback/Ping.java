package kipohaDS.Listeners.SlashCommands.SlashCallback;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class Ping {
    public void callback(SlashCommandInteractionEvent event) {
        event.reply("Pong!").setEphemeral(true).queue();
    }
}
