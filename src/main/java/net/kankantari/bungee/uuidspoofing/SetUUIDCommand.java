package net.kankantari.bungee.uuidspoofing;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.UUID;

public class SetUUIDCommand extends Command {
    public SetUUIDCommand() {
        super("setuuid", "uuidspoofing.setuuid");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        UUID uuid;
        try {
            uuid = UUID.fromString(args[0]);
        } catch (IllegalArgumentException ex) {
            PluginMain.log("Invalid argument");
            return;
        }

        PluginMain.setPlayerUuid(uuid);
    }
}
