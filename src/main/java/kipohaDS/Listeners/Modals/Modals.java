package kipohaDS.Listeners.Modals;

import kipohaDS.Listeners.Modals.ModalCallback.*;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Modals extends ListenerAdapter {
    @Override
    public void onModalInteraction(ModalInteractionEvent event) {
        switch (event.getModalId()) {
            case "modaltext1":
                new ModalText().callback(event);
                break;
            default:
                break;
        }
    }
}
