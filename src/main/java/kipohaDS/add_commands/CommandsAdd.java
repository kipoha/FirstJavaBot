package kipohaDS.add_commands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;

import static net.dv8tion.jda.api.interactions.commands.OptionType.STRING;

public class CommandsAdd {
    public void AddCommands(JDA bot) {
        CommandListUpdateAction commands = bot.updateCommands();
        commands.addCommands(
                Commands.slash("say", "null")
                        .addOption(STRING, "content", "What the bot should say", false),
                //
                Commands.slash("test", "none"),
                //
                Commands.slash("ping", "pong!"),
                //
                Commands.slash("saychannel", "test")
                        .addOption(OptionType.CHANNEL, "channel", "testchannel", true)
                        .addOption(STRING, "content", "test Content", true),
                //
                Commands.slash("timeout", "timeout member")
                        .addOption(OptionType.USER, "member", "testuser", true)
                        .addOption(OptionType.INTEGER, "time", "times", true)
                        .addOption(OptionType.STRING, "reason", "reason", true),
                //
                Commands.slash("ban", "ban member")
                        .addOption(OptionType.USER, "member", "banuser", true)
                        .addOption(OptionType.INTEGER, "time", "times", true)
                        .addOption(OptionType.STRING, "reason", "reason", true)
        ).queue();
    }
}