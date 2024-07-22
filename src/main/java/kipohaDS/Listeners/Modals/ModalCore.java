package kipohaDS.Listeners.Modals;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;

public class ModalCore {
    public void callback (ModalInteractionEvent event) {
        event.reply("pong!").setEphemeral(true).queue();
    }
}
