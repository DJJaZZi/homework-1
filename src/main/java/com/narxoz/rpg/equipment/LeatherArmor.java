package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor{
    private int defense;
    private String armorType;
    private int durability;
    private int weight;

    public LeatherArmor(){
        this.defense = 10;
        this.armorType = "Leather armor";
        this.durability = 10;
        this.weight = 5;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public String getArmorInfo() {
        return "Leater Armor (Ranger) - aiming is much faster";
    }

    public void displayInfo(){
        System.out.println("Armor: "  + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Durability: " + durability);
        System.out.println("Weight: " + weight);
    }
}
