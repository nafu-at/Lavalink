/*
 * Copyright 2020 NAFU_at.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lavalink.server.neojukepro;

import lavalink.client.io.jda.JdaLavalink;
import net.dv8tion.jda.api.sharding.ShardManager;
import org.springframework.stereotype.Component;
import page.nafuchoco.neojukepro.core.NeoJukeLauncher;
import page.nafuchoco.neojukepro.core.command.CommandRegistry;
import page.nafuchoco.neojukepro.core.config.NeoJukeConfig;
import page.nafuchoco.neojukepro.core.database.DatabaseConnector;
import page.nafuchoco.neojukepro.core.module.ModuleManager;
import page.nafuchoco.neojukepro.core.player.CustomSourceRegistry;
import page.nafuchoco.neojukepro.core.player.GuildPlayerRegistry;

@Component
public class Launcher implements NeoJukeLauncher {
    private final ModuleManager moduleManager;
    private final CustomSourceRegistry customSourceRegistry;
    private final CommandRegistry commandRegistry;

    public Launcher() {
        customSourceRegistry = new CustomSourceRegistry();
        commandRegistry = new CommandRegistry();
        moduleManager = new ModuleManager(this, "modules");
        moduleManager.loadAllModules();
        moduleManager.enableAllModules();
    }

    @Override
    public void launch() {
        // Do Nothing.
    }

    @Override
    public NeoJukeConfig getConfig() {
        return null;
    }

    @Override
    public DatabaseConnector getConnector() {
        return null;
    }

    @Override
    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    @Override
    public CustomSourceRegistry getCustomSourceRegistry() {
        return customSourceRegistry;
    }

    @Override
    public CommandRegistry getCommandRegistry() {
        return commandRegistry;
    }

    @Override
    public ShardManager getShardManager() {
        return null;
    }

    @Override
    public JdaLavalink getLavaLink() {
        return null;
    }

    @Override
    public GuildPlayerRegistry getPlayerRegistry() {
        return null;
    }
}
