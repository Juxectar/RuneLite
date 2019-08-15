package net.runelite.client.plugins._CorpFlinching;


import com.google.inject.Inject;
import com.google.inject.Provides;
import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import java.util.*;

@PluginDescriptor(name = "__TestPlugin")
public class _CorpFlinchingPlugin extends Plugin {
	Random rand = new Random();
	@Inject
	Client client;
	@Inject
	private _CorpFlinchingConfig testpluginConfig;
	@Inject
	private _CorpFlinchingOverlay testpluginOverlay;
	@Inject
	private OverlayManager overlayManager;
	@Inject
	private ItemManager itemManager;

	@Provides
	_CorpFlinchingConfig getConfig(ConfigManager configManager) {
		return configManager.getConfig(_CorpFlinchingConfig.class);
	}


	@Subscribe
	public void onConfigChanged(ConfigChanged event) {

	}

	@Subscribe
	public void onGameTick(GameTick tick) {



	}

	@Subscribe
	public void onItemSpawned(ItemSpawned item) {
		System.out.println(itemManager.getItemPrice(item.getItem().getId()));



	}

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded menuEntry){


	}
	@Subscribe
	public void onItemDespawned(ItemDespawned itemDespawned) {


	}

	@Override
	protected void startUp() throws Exception {
		System.out.println("nemjef start");
		overlayManager.add(testpluginOverlay);
	}

	@Override
	protected void shutDown() throws Exception {
		System.out.println("end");
		overlayManager.remove(testpluginOverlay);
	}
}
