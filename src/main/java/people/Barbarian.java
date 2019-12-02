package people;

import behaviours.IWeapon;
import equipment.Armour;
import equipment.Inventory;
import equipment.Weapons;

import java.util.ArrayList;

public class Barbarian extends Humans implements IWeapon {

    public int attackPower;
    public int defendPower;

    public Barbarian(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.canFight = true;
        this.inventory = inventory;
        this.attackPower = 0;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public int attack() {
//        if (canFight = true) {
        int attackPower = getStrength() * inventory.getWeaponDamage();
//        }
        return attackPower;

    }

    public int defend() {
            int defendPower = inventory.getArmourProtection() * this.hp;
            return this.hp = defendPower;
    }

}
