package people;

import equipment.Armour;
import equipment.Inventory;
import equipment.Magic;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Inventory inventory;

    @Before
    public void before(){

        barbarian = new Barbarian("Mudface", 40, 800, Weapons.AXE, Armour.HEAVY_ARMOUR);
        inventory = new Inventory(Armour.HEAVY_ARMOUR, Magic.FIREBALL, Weapons.AXE);
    }
    @Test
    public void hasName(){
        assertEquals("Mudface", barbarian.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(40, barbarian.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(800, barbarian.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, barbarian.canFight());
    }

    @Test
    public void hasWeapon(){
        barbarian.equipWeapon(inventory);
        assertEquals(Weapons.AXE, barbarian.getWeapon());
    }

    @Test
    public void hasArmour(){
        barbarian.equipArmour(inventory);
        assertEquals(Armour.HEAVY_ARMOUR, barbarian.getArmour());
    }

}
