package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public interface CharacterFactory {
    Character createCharacter(String name);
}
