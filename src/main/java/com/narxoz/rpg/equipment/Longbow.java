package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {
    private int damage;
    private String weaponType;
    private int durability;
    private int weight;

    public Longbow() {
        this.damage = 40;
        this.weaponType = "Bow";
        this.durability = 30;
        this.weight = 15;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponType() {
        return this.weaponType;
    }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranger) - chance of critical damage is 20% higher";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Durability: " + durability);
        System.out.println("Weight: " + weight);
    }
}
