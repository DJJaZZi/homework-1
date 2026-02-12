package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

/**
 * Base interface for all character types in the RPG system.
 *
 * TODO: Decide if this should be an interface or abstract class
 * Think: What's common to ALL characters?
 * Think: What varies between character types?
 *
 * Factory Method Pattern:
 * This represents the "Product" in the Factory Method pattern.
 * Different character classes (Warrior, Mage, Archer) are concrete products.
 */
public abstract class Character {
    // TODO: Define common character behaviors
    // Consider methods like:
    // - String getName()
    // - int getHealth()
    // - int getMana()
    // - int getStrength()
    // - int getIntelligence()
    // - void displayStats()
    // - void useSpecialAbility()

    // TODO: Think about equipment
    // Should characters know about their equipped items?
    // How will you handle equipping weapons and armor?

    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    protected Weapon equippedWeapon;
    protected Armor equippedArmor;

    public void equipWeapon(Weapon weapon){
        this.equippedWeapon = weapon;
        System.out.println(this.name + " equipped weapon " + weapon);
    }

    public void equipArmor(Armor armor){
        this.equippedArmor = armor;
        System.out.println(this.name + " equipped armor " + armor);
    }

    public void displayEquipment(){
        if (equippedWeapon != null) {
            System.out.println(this.name + " have " + equippedWeapon);
        }else{
            System.out.println(this.name + " does not have any weapon");
        }

        if (equippedArmor != null) {
            System.out.println(this.name + " have " + equippedArmor);
        }else{
            System.out.println(this.name + " does not have any armor");
        }
    }
    public Character(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayStats(){
        System.out.println(this.name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
        System.out.println();
    }

    public void useSpecialAbility(){}

}
