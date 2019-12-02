package people;

import equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;
    Inventory inventory;

    @Before
    public void before(){

        inventory = new Inventory(Armour.NONE, Magic.NONE, Weapons.DAGGER, Heal.HERB);
        cleric = new Cleric("Friar Tuck", 30, 400, inventory);
    }
    @Test
    public void hasName(){
        assertEquals("Friar Tuck", cleric.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(30, cleric.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(400, cleric.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, cleric.canFight());
    }

    @Test
    public void canHeal(){
        assertEquals(true, cleric.canHeal());
    }

    @Test
    public void hasHealingItem(){
        assertEquals(Heal.HERB, cleric.getHealing());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.DAGGER, cleric.getWeapon());
    }
}
