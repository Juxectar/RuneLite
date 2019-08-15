package net.runelite.client.plugins._CorpFlinching;


import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("__testplugin")

public interface _CorpFlinchingConfig extends Config {
	@ConfigItem(
			keyName = "numbers",
			name = "animation id",
			description = "",
			position = 1
	)
	default int numbers() {
		return 1;
	}

	@ConfigItem(
			keyName = "numbers",
			name = "reset graphics",
			description = "",
			position = 1
	)
	default boolean graphicss() {
		return false;
	}
}
