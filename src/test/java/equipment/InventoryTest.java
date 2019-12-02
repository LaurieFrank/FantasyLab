package equipment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {
    Armour armour;
    Magic magic;
    Weapons weapon;
    Inventory inventory;

    @Before
    public void before(){
        inventory = new Inventory(Armour.HEAVY_ARMOUR, Magic.FIREBALL, Weapons.AXE, Heal.HERB);
    }

    @Test
    public void getWeaponDamage(){
        assertEquals(5, inventory.getWeaponDamage());
    }

    @Test
    public void getArmourProtection(){
        assertEquals(4, inventory.getArmourProtection());
    }

    @Test
    public void getMagicDamage(){
        assertEquals(3, inventory.getMagicDamage());
    }
}
