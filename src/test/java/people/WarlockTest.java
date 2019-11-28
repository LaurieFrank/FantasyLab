package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Gandalf", 50, 70);
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
        assertEquals(70, warlock.getHp());
    }

    @Test
    public void canFight(){
        assertEquals(false, warlock.canFight());
    }

    @Test
    public void isMagical(){
        assertEquals(true, warlock.isMagical());
    }

}
