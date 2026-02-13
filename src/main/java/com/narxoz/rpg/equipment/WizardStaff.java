package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon{
    private int damage;
    private String weaponType;
    private int durability;
    private int weight;

    public WizardStaff() {
        this.damage = 30;
        this.weaponType = "Staff";
        this.durability = 40;
        this.weight = 10;
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
        return "Wizard Staff (Magic) - makes casting special ability much faster";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Durability: " + durability);
        System.out.println("Weight: " + weight);
    }

}
