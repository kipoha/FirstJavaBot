package kipohaDS.Listeners.Selectors;

import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Selectors extends ListenerAdapter {
    @Override
    public void onStringSelectInteraction(StringSelectInteractionEvent event) {
        switch (event.getComponentId()) {
            case "foods":
                String value = event.getValues().get(0);
                event.reply("Foods: " + value).setEphemeral(true).queue();
                break;
            default:
                break;
        }
    }
}
