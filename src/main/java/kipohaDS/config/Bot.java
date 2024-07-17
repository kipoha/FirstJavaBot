package kipohaDS.config;

import kipohaDS.Listeners.Buttons.Buttons;
import kipohaDS.Listeners.Events.Event;
import kipohaDS.Listeners.Modals.Modals;
import kipohaDS.Listeners.SlashCommands.SlashCommands;
import kipohaDS.add_commands.CommandsAdd;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Bot {
    public JDA buildBot() {
        String token = new Tokens().getToken();
        if (token == null || token.isEmpty()) {
            System.err.println("TOKEN environment variable not set.");
            return null;
        }
        JDA bot = JDABuilder.createDefault(token)
                .setActivity(Activity.customStatus("Hello java"))
                .addEventListeners(new SlashCommands(), new Buttons(), new Event(), new Modals())
                .enableIntents(GatewayIntent.getIntents(GatewayIntent.ALL_INTENTS))
                .build();
        new CommandsAdd().AddCommands(bot);
        return bot;
    }
}
