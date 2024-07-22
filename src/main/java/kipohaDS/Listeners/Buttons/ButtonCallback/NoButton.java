package kipohaDS.Listeners.Buttons.ButtonCallback;

import kipohaDS.Listeners.Buttons.ButtonCore;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;

public class NoButton extends ButtonCore {
    @Override
    public void callback(ButtonInteractionEvent event) {
        event.reply("no")
                .setEphemeral(true)
                .queue();
    }
}
