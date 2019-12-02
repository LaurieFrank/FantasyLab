package people;

import equipment.Heal;
import equipment.Weapons;
import equipment.Inventory;

import java.util.ArrayList;

public class Cleric extends Healers {
    public Cleric(String name, int strength, int hp, Inventory inventory) {
        super(name, strength, hp, inventory);
        this.canFight = true;
        this.canHeal = true;
        this.inventory = inventory;
    }
}
