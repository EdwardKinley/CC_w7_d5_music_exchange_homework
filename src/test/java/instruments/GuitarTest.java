package instruments;

import instruments.instrumentproperties.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(100, 140, MaterialType.WOOD, 6);
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


}
