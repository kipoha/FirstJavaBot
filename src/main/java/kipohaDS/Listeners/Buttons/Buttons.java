package kipohaDS.Listeners.Buttons;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.text.TextInput;
import net.dv8tion.jda.api.interactions.components.text.TextInputStyle;
import net.dv8tion.jda.api.interactions.modals.Modal;

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
            case "modalbutton":
                TextInput text1 = TextInput.create("tt1", "Name", TextInputStyle.SHORT)
                        .setPlaceholder("This is a placeholder")
                        .setRequired(true)
                        .setMaxLength(100)
                        .build();
                TextInput text2 = TextInput.create("tt2", "Description", TextInputStyle.PARAGRAPH)
                        .setPlaceholder("This is a placeholder2")
                        .setRequired(false)
                        .setMaxLength(500)
                        .build();
                Modal modal = Modal.create("modaltext1", "Modal")
                        .addComponents(ActionRow.of(text1), ActionRow.of(text2))
                        .build();
                event.replyModal(modal).queue();
                break;
            case "foodsbutton":
                event.reply("foodsbutton").queue();
                break;
            default:
                event.reply("Unknown button.")
                        .setEphemeral(true)
                        .queue();
                break;
        }
    }
}