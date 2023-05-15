package net.kankantari.bungee.uuidspoofing;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.UUID;
import java.util.logging.Logger;

public class PluginMain extends Plugin {
    private static UUID playerUuid;
    private static Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();
        setPlayerUuid(UUID.randomUUID());

        getProxy().getPluginManager().registerCommand(this, new SetUUIDCommand());
        getProxy().getPluginManager().registerListener(this, new PlayerLoginEventListener());
    }

    public static void setPlayerUuid(UUID uuid) {
        playerUuid = uuid;
        log("Player unique id will be set to '" + uuid.toString() + "'");
    }

    public static UUID getPlayerUuid() {
        return playerUuid;
    }

    public static void log(String message) {
        logger.info(message);
    }
}
