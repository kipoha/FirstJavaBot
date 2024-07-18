package kipohaDS.Listeners.SlashCommands.SlashCallback;

import kipohaDS.Listeners.SlashCommands.SlashCore;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class Test extends SlashCore {
    @Override
    public void callback(SlashCommandInteractionEvent event) {
        event.reply("Hello World!").queue();
    }
}
