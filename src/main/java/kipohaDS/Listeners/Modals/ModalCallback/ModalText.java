package kipohaDS.Listeners.Modals.ModalCallback;

import kipohaDS.Listeners.Modals.ModalCore;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;

public class ModalText extends ModalCore {
    @Override
    public void callback(ModalInteractionEvent event) {
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
    }
}
