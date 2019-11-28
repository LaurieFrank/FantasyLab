package people;

import behaviours.IWeapon;
import equipment.Armour;
import equipment.Inventory;
import equipment.Weapons;

import java.util.ArrayList;

public class Barbarian extends Person implements IWeapon {

    private Weapons weapon;
    private Armour armour;


    public Barbarian(String name, int strength, int hp, Weapons weapon, Armour armour) {
        super(name, strength, hp);
        this.canFight = true;
        this.inventory = new ArrayList<Inventory>();
        this.weapon = weapon;
        this.armour = armour;
    }

    public int attack() {
        return 0;
    }

    public int defend() {
        return 0;
    }

    public void equipWeapon(Inventory weapon){
        for (Inventory newWeapon : inventory){
            if (weapon == newWeapon){
                this.weapon = weapon.getWeapon();
            }
        }
    }

    public Weapons getWeapon(){
        return this.weapon;
    }

    public void equipArmour(Inventory armour){
        for (Inventory newArmour : inventory){
            if (armour == newArmour){
                this.armour = armour.getArmour();
            }
        }
    }

    public Armour getArmour(){
        return this.armour;
    }
}
