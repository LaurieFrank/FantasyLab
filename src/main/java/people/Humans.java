package people;

import equipment.Armour;
import equipment.Inventory;
import equipment.Weapons;

public abstract class Humans extends Person {


    public Humans(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
    }


    public Weapons getWeapon(){
        return this.inventory.getWeapon();
    }

    public Armour getArmour(){
        return this.inventory.getArmour();
    }
}
