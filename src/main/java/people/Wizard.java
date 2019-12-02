package people;

import equipment.Inventory;
import equipment.Magic;

import java.util.ArrayList;

public class Wizard extends Magicians {

    public Wizard(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.isMagical = true;
        this.inventory = inventory;
    }
}
