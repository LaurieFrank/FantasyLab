package people;

import equipment.Heal;
import equipment.Inventory;
import equipment.Weapons;

public abstract class Healers extends Person{


    public Healers(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.inventory = inventory;
    }

    public Weapons getWeapon(){
        return this.inventory.getWeapon();
    }

    public Heal getHealing(){
        return this.inventory.getHealing();
    }
}
