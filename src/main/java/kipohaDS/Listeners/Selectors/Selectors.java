package kipohaDS.Listeners.Selectors;

import kipohaDS.Listeners.Selectors.SelectCallback.*;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Selectors extends ListenerAdapter {
    @Override
    public void onStringSelectInteraction(StringSelectInteractionEvent event) {
        switch (event.getComponentId()) {
            case "foods":
                new FoodsSelect().callback(event);
                break;
            default:
                break;
        }
    }
}
