package kipohaDS.Listeners.Buttons;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Buttons extends ListenerAdapter {
    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {
        String[] idParts = event.getButton().getId().split(":");
        String buttonId = idParts[0];
        long allowedUserId = Long.parseLong(idParts[1]);

        if (event.getUser().getIdLong() != allowedUserId) {
            event.reply("You are not allowed to use this button.")
                    .setEphemeral(true)
                    .queue();
            return;
        }
        switch (buttonId) {
            case "yes":
                event.reply("yes")
                        .setEphemeral(true)
                        .queue();
                break;
            case "no":
                event.reply("no")
                        .setEphemeral(true)
                        .queue();
        }
    }
}
