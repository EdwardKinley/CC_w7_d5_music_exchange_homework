package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(100, 140, MaterialType.WOOD, ColourType.BROWN,6);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(100, guitar.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(140, guitar.getSellPrice());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(40, guitar.calculateMarkup());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(MaterialType.WOOD, guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(ColourType.BROWN, guitar.getColour());
    }

    @Test
    public void canGetFamily() {
        assertEquals(FamilyType.STRING, guitar.getFamily());
    }

    @Test
    public void canPlay() {
        assertEquals("strum", guitar.play());
    }


}
