package mythicals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;

    @Before
    public void before(){
        troll = new Troll("Grawp", 100, 100, 0.5d);
    }
    @Test
    public void hasName(){
        assertEquals("Grawp", troll.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(100, troll.getStrength());
    }

    @Test
    public void hasHp(){
        assertEquals(100, troll.getHp());
    }

    @Test
    public void hasAbility(){
        assertEquals(0.5d, troll.getAbility(), 0.05);
    }
}
