package net.craftycram.remcafkfishfarm;

import com.sasha.reminecraft.api.RePlugin;
import com.sasha.simplecmdsys.SimpleCommandProcessor;
import me.someonelove.bettercommandsystem.CommandProcessor;
import net.craftycram.remcafkfishfarm.cmds.FishFarmCmd;

public class Main extends RePlugin {

    public static CommandProcessor commandProcessor = new CommandProcessor(";");

    @Override
    public void onPluginInit() {
    }

    @Override
    public void onPluginEnable() {

    }

    @Override
    public void onPluginDisable() {

    }

    @Override
    public void onPluginShutdown() {

    }

    @Override
    public void registerCommands() {
        commandProcessor.registerCommand(new FishFarmCmd());
    }

    @Override
    public void registerConfig() {

    }

}
