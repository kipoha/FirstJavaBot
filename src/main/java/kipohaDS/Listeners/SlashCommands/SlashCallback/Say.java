package kipohaDS.Listeners.SlashCommands.SlashCallback;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.util.Objects;

public class Say {
    public void callback(SlashCommandInteractionEvent event) {
        event.reply(Objects.requireNonNull(event.getOption("content")).getAsString()).queue();
    }
}