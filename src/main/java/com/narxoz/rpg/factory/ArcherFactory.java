package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;

public class ArcherFactory implements CharacterFactory{
    @Override
    public Character createFactory(String name) {
        return new Archer(name);
    }
}
