package com.narxoz.rpg;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.factory.*;

/**
 * Main demonstration class for the RPG Character & Equipment System.
 *
 * Your task: Demonstrate both Factory Method and Abstract Factory patterns working together.
 *
 * This file should showcase:
 * 1. Creating different character types using Factory Method pattern
 * 2. Equipping characters with themed equipment using Abstract Factory pattern
 * 3. Displaying character stats and equipment details
 *
 * Expected output flow:
 * - Create 3+ different characters
 * - Equip each with different themed equipment sets
 * - Show that the system is extensible and maintainable
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        // TODO: Demonstrate Factory Method Pattern
        // Create different character types (Warrior, Mage, Archer, etc.)
        // Think: How can you create characters without using if-else chains?
        // Think: What class/interface should handle character creation?

        CharacterFactory WarriorFactory = new WarriorFactory();
        CharacterFactory MageFactory = new MageFactory();
        CharacterFactory ArcherFactory = new ArcherFactory();

        Character warrior = WarriorFactory.createCharacter("Leonidas 1");
        Character archer = ArcherFactory.createCharacter("Robin Hood");
        Character mage = MageFactory.createCharacter("Merlin");


        // TODO: Demonstrate Abstract Factory Pattern
        // Create equipment sets (Medieval, Magic, Ranger, etc.)
        // Think: How do you ensure weapons and armor from same theme are created together?
        // Think: What guarantees a Medieval sword comes with Medieval armor?

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory rangerFactory = new RangerEquipmentFactory();
        EquipmentFactory magicFactory = new MagicEquipmentFactory();


        // TODO: Show character stats
        // Display each character's attributes (health, mana, strength, intelligence)
        // Show their special abilities

        System.out.println("\n --- Character stats --- ");
        warrior.displayStats();
        archer.displayStats();
        mage.displayStats();


        // TODO: Equip characters with different themed sets
        // Warrior with Medieval equipment
        // Mage with Magic equipment
        // Archer with Ranger equipment
        // etc.

        System.out.println();
//      equip warrior
        warrior.equipArmor(medievalFactory.createArmor());
        warrior.equipWeapon(medievalFactory.createWeapon());

//      equip archer
        archer.equipArmor(rangerFactory.createArmor());
        archer.equipWeapon(rangerFactory.createWeapon());

//      equip mage
        mage.equipArmor(magicFactory.createArmor());
        mage.equipWeapon(magicFactory.createWeapon());

        // TODO: Display equipped items
        // Show weapon details (damage, special properties)
        // Show armor details (defense, special properties)

        System.out.println("\n--- Equipments ---");
        warrior.displayEquipment();
        archer.displayEquipment();
        mage.displayEquipment();

        // TODO: (Optional) Demonstrate extensibility
        // In comments, explain how easy it would be to:
        // - Add a new character class (e.g., Rogue, Paladin)
        // - Add a new equipment theme (e.g., Dragon Slayer, Undead)

//        1. Adding new Character class:
//              Create new class "Paladin" which extends "Character"
//              Create new character factory "PaladinFactory" which implements "CharacterFactory"
//        2. Adding new Equipment theme:
//              Create new item classes: "DragonSlayerSword" and "DragonSlayerArmor"
//              Create new equipment factory "DragonSlayerFactory" which implements "EquipmentFactory"


        Character soldier = createAndDisplayCharacter(ArcherFactory, "Hawkeye");
        System.out.println("\n --- Equipping Characters --- ");
        equipCharacter(soldier, rangerFactory);
        System.out.println("\n --- Character Info --- ");
        displayCharacterInfo(soldier);


        System.out.println("\n=== Demo Complete ===");
    }

    private static Character createAndDisplayCharacter(CharacterFactory factory, String name){
        Character character = factory.createCharacter(name);
        System.out.println("\nCreating character: " + name);
        character.displayStats();
        return character;
    }

    private static void equipCharacter(Character character, EquipmentFactory equipmentFactory){
        Weapon weapon = equipmentFactory.createWeapon();
        Armor armor = equipmentFactory.createArmor();

        character.equipWeapon(weapon);
        character.equipArmor(armor);
        System.out.println("\n --- " + character.getName() +  " Equipped --- ");
    }

    private static void displayCharacterInfo(Character character){
        System.out.println("\n --- " + character.getName() + " Information --- ");
        character.displayStats();
        character.displayEquipment();
        System.out.println();
    }
    // TODO: Add helper methods as needed
    // Consider methods like:
    // - createAndDisplayCharacter(...)
    // - equipCharacter(...)
    // - displayCharacterInfo(...)


}
