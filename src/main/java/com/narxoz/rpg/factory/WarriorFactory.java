package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Warrior;

public class WarriorFactory implements CharacterFactory{
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
