package com.silahmod.item;

import com.silahmod.WeaponConfig;

/** Revolver: 8 mermilik sarjor, hizli ates. Sayilar WeaponConfig.REVOLVER'da. */
public class RevolverItem extends GunItem {
	public RevolverItem(Properties properties) {
		super(properties, WeaponConfig.REVOLVER);
	}
}
