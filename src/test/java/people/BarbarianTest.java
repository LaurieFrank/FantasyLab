package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Mudface", 40, 80);
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
        assertEquals(80, barbarian.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, barbarian.canFight());
    }

}
