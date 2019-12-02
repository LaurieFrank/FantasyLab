package people;

import equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Inventory inventory;

    @Before
    public void before(){

        inventory = new Inventory(Armour.LIGHT_ARMOUR, Magic.NONE, Weapons.AXE, Heal.NONE);
        dwarf = new Dwarf("Gimli", 60, 700, inventory);
    }
    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(60, dwarf.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(700, dwarf.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, dwarf.canFight());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.AXE, dwarf.getWeapon());
    }

    @Test
    public void hasArmour(){
        assertEquals(Armour.LIGHT_ARMOUR, dwarf.getArmour());
    }

}
