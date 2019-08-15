package net.runelite.client.plugins._CorpFlinching;

import net.runelite.api.*;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import java.awt.*;

public class _CorpFlinchingOverlay extends Overlay {

	int counter = 0;
	private int itemid = 0;
	private _CorpFlinchingConfig config;
	@Inject
	private Client client;
	@Inject
	private ItemManager itemManager;

	@Inject
	public _CorpFlinchingOverlay(_CorpFlinchingConfig config) {
		this.config = config;
		setLayer(OverlayLayer.ABOVE_SCENE);
		setPosition(OverlayPosition.DYNAMIC);
		setPriority(OverlayPriority.MED);
	}

	int animationloop=0;
	@Override
	public Dimension render(Graphics2D graphics) {

		if (config.graphicss()) {
			OverlayUtil.renderPolygon(graphics, client.getLocalPlayer().getCanvasTilePoly(), Color.RED);



			for (Player p : client.getPlayers()){
				for (int i: p.getPlayerComposition().getEquipmentIds()){
				}



			}

		}
		if (!config.graphicss()) {
			counter = 0;
		}
		return null;
	}


	@Subscribe
	public void onItemSpawned(ItemSpawned item) {
		System.out.println(itemManager.getItemPrice(item.getItem().getId()));

	}
}
