package kipohaDS.Listeners.SlashCommands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class SlashCore {
    public void callback (SlashCommandInteractionEvent event) {
        event.reply("pong!").setEphemeral(true).queue();
    }
}
