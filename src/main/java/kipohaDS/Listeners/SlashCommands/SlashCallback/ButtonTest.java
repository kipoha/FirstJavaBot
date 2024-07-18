package kipohaDS.Listeners.SlashCommands.SlashCallback;

import kipohaDS.Listeners.SlashCommands.SlashCore;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class ButtonTest extends SlashCore {
    @Override
    public void callback(SlashCommandInteractionEvent event) {
        long userId = event.getUser().getIdLong();
        event.reply("cake so sweaty?")
            .addActionRow(
                    Button.success("yes:"+userId, "Yes"),
                    Button.danger("no:"+userId, "No"),
                    Button.secondary("test", "test")
            )
            .queue();
    }
}
