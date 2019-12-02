package people;

import equipment.Inventory;
import equipment.Magic;

public abstract class Magicians extends Person{

    public Magicians(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.inventory = inventory;
    }

    public Magic getMagic(){

        return this.inventory.getMagic();
    }

}
