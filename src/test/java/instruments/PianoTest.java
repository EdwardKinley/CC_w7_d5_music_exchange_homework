package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(1000, 1300, MaterialType.WOOD, ColourType.BLACK, FamilyType.KEYBOARD,88);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1000, piano.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1300, piano.getSellPrice());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(300, piano.calculateMarkup());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(MaterialType.WOOD, piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(ColourType.BLACK, piano.getColour());
    }

    @Test
    public void canGetFamily() {
        assertEquals(FamilyType.KEYBOARD, piano.getFamily());
    }


}
