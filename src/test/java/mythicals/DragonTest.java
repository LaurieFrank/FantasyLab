package mythicals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Smaug", 100, 1000, 1.5d);
    }
    @Test
    public void hasName(){
        assertEquals("Smaug", dragon.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(100, dragon.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(1000, dragon.getHp());
    }

    @Test
    public void hasAbility(){
        assertEquals(1.5d, dragon.getAbility(), 0.05);
    }
}