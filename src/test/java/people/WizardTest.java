package people;

import equipment.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Inventory inventory;

    @Before
    public void before(){

        inventory = new Inventory(Armour.NONE, Magic.FIREBALL, Weapons.NONE, Heal.NONE);
        wizard = new Wizard("Radagast", 50, 500, inventory);
    }
    @Test
    public void hasName(){
        assertEquals("Radagast", wizard.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(50, wizard.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(500, wizard.getHp());
    }

    @Test
    public void isMagical(){
        assertEquals(true, wizard.isMagical());
    }

    @Test
    public void hasMagic(){
        assertEquals(Magic.FIREBALL, wizard.getMagic());
    }
}
