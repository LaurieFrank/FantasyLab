package people;

import equipment.Armour;
import equipment.Inventory;
import equipment.Weapons;

import java.util.ArrayList;

public class Dwarf extends Humans{

    public Dwarf(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.canFight = true;
        this.inventory = inventory;
    }
}
