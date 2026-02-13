package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.EnchantedRobes;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.WizardStaff;

public class MagicEquipmentFactory implements EquipmentFactory{
    @Override
    public Armor createArmor() {
        return new EnchantedRobes();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
