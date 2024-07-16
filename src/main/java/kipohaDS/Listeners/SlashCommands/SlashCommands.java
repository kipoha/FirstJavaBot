package kipohaDS.Listeners.SlashCommands;

import kipohaDS.Listeners.SlashCommands.SlashCallback.*;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SlashCommands extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        switch (event.getName()) {
            case "say":
                new Say().callback(event);
                break;
            case "test":
                new Test().callback(event);
                break;
            case "ping":
                new Ping().callback(event);
                break;
            case "saychannel":
                new SayInChannel().callback(event);
                break;
            case "timeout":
                new Mute().callback(event);
                break;
            case "ban":
                new Ban().callback(event);
                break;
            default:
                break;
        }
    }
}
