package people;

import equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Inventory inventory;

    @Before
    public void before(){

        inventory = new Inventory(Armour.SHIELD, Magic.NONE, Weapons.AXE, Heal.NONE);
        barbarian = new Barbarian("Mudface", 40, 800, inventory);
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
        assertEquals(Weapons.AXE, barbarian.getWeapon());
    }

    @Test
    public void getAttackPower(){
        assertEquals(0, barbarian.getAttackPower());
    }
//    @Test
//    public void attack(){
//        assertEquals(200, barbarian.getAttackPower());
//    }

    @Test
    public void defend(){
        assertEquals(2400, barbarian.getHp());
    }
}
