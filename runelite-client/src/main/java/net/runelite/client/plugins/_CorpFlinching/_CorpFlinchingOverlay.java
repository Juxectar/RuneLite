package net.runelite.client.plugins._CorpFlinching;

import javafx.animation.Animation;
import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.overlay.*;

import javax.inject.Inject;
import java.awt.*;

public class _CorpFlinchingOverlay extends Overlay {

	boolean corphasstomped;
	int stompcounter = 0;
	int hitcounter;
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

	@Override
	public Dimension render(Graphics2D graphics) {


		if (config.stompCounter()) {
			if (corphasstomped) {
				if (stompcounter == 0) {
					OverlayUtil.renderTextLocation(graphics, new Point(250, 40), "Corp cycle: " + "1 STOMP", Color.ORANGE);
				} else
					OverlayUtil.renderTextLocation(graphics, new Point(250, 40), "Corp cycle: " + (stompcounter + 1), Color.ORANGE);
			}
		}

		if (config.flinchCounter()) {
			if (hitcounter <= 10) {

				if (hitcounter == 8)
					OverlayUtil.renderTextLocation(graphics, new Point(250, 60), "Retaliate delay: " + (hitcounter + "CLICK"), Color.ORANGE);

				OverlayUtil.renderTextLocation(graphics, new Point(250, 60), "Retaliate delay: " + (hitcounter), Color.ORANGE);
			}
		}

		return null;
	}
}
