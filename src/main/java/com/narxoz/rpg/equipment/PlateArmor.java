package com.narxoz.rpg.equipment;

import javax.xml.transform.Source;

public class PlateArmor implements Armor{
    private int defense;
    private String armorType;
    private int durability;
    private int weight;

    public PlateArmor(){
        this.defense = 40;
        this.armorType = "Armor";
        this.durability = 60;
        this.weight = 30;
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
        return "Plate armor was forged by the best gunsmiths of the last century";
    }

    public void displayInfo(){
        System.out.println("Armor: "  + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Durability: " + durability);
        System.out.println("Weight: " + weight);
    }
}
