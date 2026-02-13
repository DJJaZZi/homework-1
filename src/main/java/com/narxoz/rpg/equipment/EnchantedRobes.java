package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor{
    private int defense;
    private String armorType;
    private int durability;
    private int weight;

    public EnchantedRobes(){
        this.defense = 40;
        this.armorType = "Magic Armor";
        this.durability = 50;
        this.weight = 20;
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
        return "Enchanted Robes (Magic) - this armor will provide more mana and intelligence stats to its owner";
    }

    public void displayInfo(){
        System.out.println("Armor: "  + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Durability: " + durability);
        System.out.println("Weight: " + weight);
    }
}
