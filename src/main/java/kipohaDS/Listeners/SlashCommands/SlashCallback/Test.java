package kipohaDS.Listeners.SlashCommands.SlashCallback;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class Test {
    public void callback(SlashCommandInteractionEvent event) {
        event.reply("Hello World!").queue();
    }
}
