package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Aragon", 70, 40);
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
        assertEquals(40, knight.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, knight.canFight());
    }

}
