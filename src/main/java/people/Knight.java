package people;

import equipment.Armour;
import equipment.Inventory;
import equipment.Weapons;

import java.util.ArrayList;

public class Knight extends Humans {
    public Knight(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.canFight = true;
        this.inventory = inventory;

    }
}
