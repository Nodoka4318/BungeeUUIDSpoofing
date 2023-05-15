package net.kankantari.bungee.uuidspoofing;

import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.PreLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PlayerLoginEventListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PreLoginEvent e) {
        var uuid = PluginMain.getPlayerUuid();
        e.getConnection().setUniqueId(uuid);
        // e.getConnection().setOnlineMode(true);

        PluginMain.log(e.getConnection().getName() + "'s unique id was set to '" + uuid.toString() + "'!");
    }
}
