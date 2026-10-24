
package name.d3420b8b7fe04.def9a2a4.plugintemplate.backrooms.level;

import name.d3420b8b7fe04.def9a2a4.plugintemplate.backrooms.BackroomsPlugin;
import name.d3420b8b7fe04.def9a2a4.plugintemplate.backrooms.player.BackroomsPlayerState;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Collection;

public abstract class AbstractLevel implements BackroomsLevel {

    protected final BackroomsPlugin plugin;
    protected World world;

    protected AbstractLevel(BackroomsPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void configureWorld(World world) {
        this.world = world;
        world.setGameRule(GameRule.DO_MOB_SPAWNING, false);
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        world.setGameRule(GameRule.MOB_GRIEFING, false);
        world.setGameRule(GameRule.DO_WEATHER_CYCLE, false);
    }

    @Override
    public void tick(World world, Collection<Player> players) {
    }

    @Override
    public void onPlayerEnter(Player player, BackroomsPlayerState state) {
    }

    @Override
    public void onPlayerLeave(Player player, BackroomsPlayerState state) {
    }

    public World getWorld() {
        return world;
    }
}
