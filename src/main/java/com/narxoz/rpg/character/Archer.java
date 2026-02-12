package com.narxoz.rpg.character;

public class Archer extends Character{

    public Archer(String name){
        super(name);
        this.health = 90;
        this.mana = 50;
        this.strength = 60;
        this.intelligence = 100;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " Drinks magic water! Strength and intelligence temporarily increased!");
    }
}
