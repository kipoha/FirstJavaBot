package kipohaDS.Listeners.SlashCommands.SlashCallback;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class Modal {
    public void callback(SlashCommandInteractionEvent event) {
        event.reply("")
                .addActionRow(Button.secondary("modalbutton", "Modal"))
                .setEphemeral(true)
                .queue();
    }
}
