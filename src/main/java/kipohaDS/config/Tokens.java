package kipohaDS.config;

import io.github.cdimascio.dotenv.Dotenv;

public class Tokens {
    Dotenv dotenv = Dotenv.load();

    private String bot_token = dotenv.get("DISCORD_TOKEN");
    private String channelId = dotenv.get("CHANNELID");

    public String getToken() {
        return bot_token;
    }

    public String getChannelId() {
        return channelId;
    }
}
