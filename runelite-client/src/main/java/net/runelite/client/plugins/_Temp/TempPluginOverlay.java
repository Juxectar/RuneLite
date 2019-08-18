package net.runelite.client.plugins._Temp;


import com.google.inject.Inject;
import com.sun.istack.internal.NotNull;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.components.*;
import net.runelite.client.ui.overlay.components.ComponentOrientation;
import net.runelite.client.ui.overlay.components.TextComponent;

import java.awt.*;
import java.util.Random;

public class TempPluginOverlay extends Overlay {
	@Inject
	TempPluginConfig config;
	@Inject
	Client client;

	PanelComponent panelComponent = new PanelComponent();
	ProgressPieComponent progressPieComponent = new ProgressPieComponent();
	InfoBoxComponent infoBoxComponent = new InfoBoxComponent();
	ProgressBarComponent progressBarComponent = new ProgressBarComponent();

	@Override
	public Dimension render(Graphics2D graphics) {
		if (config.TempButton1()) {


			panelComponent.getChildren().clear();

			/*
			panelComponent.getChildren().add(LineComponent.builder()
					.left("Total Laps:")
					.right(Integer.toString(new Random().nextInt(500)))
					.build());

			 */
			panelComponent.getChildren().add(LineComponent.builder().left("nig").right("nignig").leftColor(Color.blue).rightColor(Color.CYAN).build());
			panelComponent.setPreferredSize(new Dimension(100,100));
			panelComponent.setPreferredLocation(new Point(client.getMouseCanvasPosition().getX()-150,client.getMouseCanvasPosition().getY()-150));

			progressPieComponent.setPosition(new net.runelite.api.Point(client.getMouseCanvasPosition().getX(), client.getMouseCanvasPosition().getY()));
			progressPieComponent.setFill(Color.BLUE);
			progressPieComponent.setProgress(Math.random());

			progressBarComponent.setValue(new Random().nextInt(100));
			progressBarComponent.setCenterLabel("TEXT");
			progressBarComponent.setBackgroundColor(Color.BLUE);
			progressBarComponent.setForegroundColor(Color.CYAN);




			//progressPieComponent.render(graphics);
			//panelComponent.render(graphics);
			progressBarComponent.render(graphics);




		}
		if (!config.TempButton1()){


		}

		return null;
	}
}
