package net.runelite.client.plugins._CorpFlinching;


import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("__testplugin")

public interface _CorpFlinchingConfig extends Config {

	@ConfigItem(
			keyName = "Stomp counter",
			name = "Stomp Counter",
			description = "Keeps track of the 7 tick stomp cycle",
			position = 1
	)
	default boolean stompCounter() {
		return false;
	}

	@ConfigItem(
			keyName = "Flinch Counter",
			name = "Flinch Counter",
			description = "Keeps track of the flinch cycle",
			position = 2
	)
	default boolean flinchCounter() {
		return false;
	}

}
