package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Radagast", 50, 50);
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
        assertEquals(50, wizard.getHp());
    }

    @Test
    public void isMagical(){
        assertEquals(true, wizard.isMagical());
    }

}
