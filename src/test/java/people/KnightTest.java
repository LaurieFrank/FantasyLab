package people;

import equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Inventory inventory;

    @Before
    public void before(){

        inventory = new Inventory(Armour.LIGHT_ARMOUR, Magic.NONE, Weapons.SWORD, Heal.NONE);
        knight = new Knight("Aragon", 70, 400, inventory);
    }
    @Test
    public void hasName(){
        assertEquals("Aragon", knight.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(70, knight.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(400, knight.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, knight.canFight());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.SWORD, knight.getWeapon());
    }

    @Test
    public void hasArmour(){
        assertEquals(Armour.LIGHT_ARMOUR, knight.getArmour());
    }
}
