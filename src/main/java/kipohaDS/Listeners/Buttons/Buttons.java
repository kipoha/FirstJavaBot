package kipohaDS.Listeners.Buttons;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Buttons extends ListenerAdapter {
    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {
        String buttonId;
        try {
            String[] idParts = event.getButton().getId().split(":");
            if (idParts.length > 1) {
                buttonId = idParts[0];
                long allowedUserId = Long.parseLong(idParts[1]);

                if (event.getUser().getIdLong() != allowedUserId) {
                    event.reply("You are not allowed to use this button.")
                            .setEphemeral(true)
                            .queue();
                    return;
                }
            } else {
                buttonId = event.getButton().getId();
            }
        } catch (Exception e) {
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
                break;
            case "test":
                event.reply("test")
                        .queue();
                break;
            default:
                event.reply("Unknown button.")
                        .setEphemeral(true)
                        .queue();
                break;
        }
    }
}