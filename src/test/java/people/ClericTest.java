package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Friar Tuck", 30, 40);
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
        assertEquals(40, cleric.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(true, cleric.canFight());
    }

    @Test
    public void canHeal(){
        assertEquals(true, cleric.canHeal());
    }

}
