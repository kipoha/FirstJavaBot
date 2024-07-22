package kipohaDS.Listeners.Buttons;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;

public class ButtonCore {
    public void callback(ButtonInteractionEvent event) {
        event.reply("pong!").queue();
    }
}
