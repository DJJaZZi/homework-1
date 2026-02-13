package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface EquipmentFactory {
    Armor createArmor();
    Weapon createWeapon();
}
