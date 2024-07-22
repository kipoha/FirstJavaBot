package kipohaDS.Listeners.Selectors;

import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;

public class SelectCore {
    public void callback (StringSelectInteractionEvent event) {
        event.reply("pong!").setEphemeral(true).queue();
    }
}
