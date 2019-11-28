package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Gimli", 60, 70);
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
        assertEquals(70, dwarf.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, dwarf.canFight());
    }



}
