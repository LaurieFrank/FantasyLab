package people;

import equipment.Inventory;
import equipment.Magic;

import java.util.ArrayList;

public class Warlock extends Magicians {
    public Warlock(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.isMagical = true;
        this.inventory = inventory;
    }
}
