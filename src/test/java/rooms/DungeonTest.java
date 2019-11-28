package rooms;

import mythicals.Dragon;
import mythicals.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dragonDungeon;
    Dungeon trollDungeon;
    Dragon dragon;
    Troll troll;

    @Before
    public void before(){
        dragonDungeon = new Dungeon("Dangerous Dragon", "Dragon");
        trollDungeon = new Dungeon("Troubling Troll", "Troll");
        troll = new Troll("Grawp", 100, 100, 0.5d);
        dragon = new Dragon("Smaug", 100, 100, 1.5d);
    }

    @Test
    public void getName(){
        assertEquals("Troubling Troll", trollDungeon.getName());
    }

    @Test
    public void getType(){
        assertEquals("Troll", trollDungeon.getType());
    }

    @Test
    public void getEnemies(){
        assertEquals(0, trollDungeon.getEnemies().size());
    }
}
