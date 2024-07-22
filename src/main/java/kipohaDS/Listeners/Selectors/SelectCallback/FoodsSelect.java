package kipohaDS.Listeners.Selectors.SelectCallback;

import kipohaDS.Listeners.Selectors.SelectCore;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;

public class FoodsSelect extends SelectCore {
    @Override
    public void callback(StringSelectInteractionEvent event) {
        String value = event.getValues().get(0);
        event.reply("Foods: " + value).setEphemeral(true).queue();
    }
}
