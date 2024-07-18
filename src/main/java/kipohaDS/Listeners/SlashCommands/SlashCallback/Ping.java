package kipohaDS.Listeners.SlashCommands.SlashCallback;

import kipohaDS.Listeners.SlashCommands.SlashCore;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class Ping extends SlashCore {
    @Override
    public void callback(SlashCommandInteractionEvent event) {
        event.reply("Pong!").setEphemeral(true).queue();
    }
}
