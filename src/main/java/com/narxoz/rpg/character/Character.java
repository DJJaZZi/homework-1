package com.narxoz.rpg.character;

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

    }
    public void useSpecialAbility(){}

}
