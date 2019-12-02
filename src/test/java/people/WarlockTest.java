package people;

import equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Inventory inventory;

    @Before
    public void before(){

        inventory = new Inventory(Armour.NONE, Magic.LIGHTNING, Weapons.NONE, Heal.NONE);
        warlock = new Warlock("Gandalf", 50, 700, inventory);
    }
    @Test
    public void hasName(){
        assertEquals("Gandalf", warlock.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(50, warlock.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(700, warlock.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(false, warlock.canFight());
    }

    @Test
    public void isMagical(){
        assertEquals(true, warlock.isMagical());
    }

    @Test
    public void hasMagic(){
        assertEquals(Magic.LIGHTNING, warlock.getMagic());
    }
}
