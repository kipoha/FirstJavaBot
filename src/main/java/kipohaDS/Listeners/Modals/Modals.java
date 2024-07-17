package kipohaDS.Listeners.Modals;

import kipohaDS.config.Bot;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Modals extends ListenerAdapter {
    @Override
    public void onModalInteraction(ModalInteractionEvent event) {
        switch (event.getModalId()) {
            case "modaltext1":
                TextChannel tc;
                tc = event.getGuildChannel().getGuild().getTextChannelById("1257032053543665859");
                if (tc == null) {
                    tc = event.getChannel().asTextChannel();
                }
                String name = event.getValue("tt1").getAsString();
                String text = event.getValue("tt2").getAsString();
                tc.sendMessage("Name: "+ name + "\nDescription: " + text).queue();
                event.reply("success!")
                        .setEphemeral(true)
                        .queue();
                break;
            default:
                break;
        }
    }
}
