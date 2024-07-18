package kipohaDS.Listeners.SlashCommands.SlashCallback;

import kipohaDS.Listeners.SlashCommands.SlashCore;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;

public class Selector extends SlashCore {
    @Override
    public void callback(SlashCommandInteractionEvent event) {
        event.reply("")
                .addActionRow(Button.secondary("foodsbutton", "FOOOOOOOOOOOOOOOOOOOOOOOOOODS!"))
                .addActionRow(
                        StringSelectMenu.create("foods")
                                .setMaxValues(1)
                                .setPlaceholder("Foods")
                                .addOption("Burger", "burger", "Mmmm burger")
                                .addOption("Chicken", "chicken", "Mmmm chicken")
                                .addOption("Pizza", "pizza", "Mmmm pizza")
                                .addOption("Sauce", "sauce", "Mmmm sauce")
                                .addOption("Water", "water", "Mmmm water")
                                .build()
                )
                .queue();
    }
}
