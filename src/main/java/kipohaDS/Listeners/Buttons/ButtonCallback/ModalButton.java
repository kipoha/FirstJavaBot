package kipohaDS.Listeners.Buttons.ButtonCallback;

import kipohaDS.Listeners.Buttons.ButtonCore;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.text.TextInput;
import net.dv8tion.jda.api.interactions.components.text.TextInputStyle;
import net.dv8tion.jda.api.interactions.modals.Modal;

public class ModalButton extends ButtonCore {
    @Override
    public void callback(ButtonInteractionEvent event) {
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
    }
}
