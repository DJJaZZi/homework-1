package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Mage;

public class MageFactory implements CharacterFactory{
    @Override
    public Character createFactory(String name) {
        return new Mage(name);
    }
}
