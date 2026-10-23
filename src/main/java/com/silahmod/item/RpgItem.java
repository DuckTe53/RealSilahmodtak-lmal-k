package com.silahmod.item;

import com.silahmod.RocketManager;
import com.silahmod.WeaponConfig;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;

/** RPG: hitscan degil, roket firlatir. Roket mantigi RocketManager'da. */
public class RpgItem extends GunItem {
	public RpgItem(Properties properties) {
		super(properties, WeaponConfig.RPG);
	}

	@Override
	public void fire(ServerPlayer player, ServerLevel level) {
		RocketManager.launch(level, player);
	}
}
