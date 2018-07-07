package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(100, 140, MaterialType.WOOD, ColourType.BROWN, 3);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(100, trumpet.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(140, trumpet.getSellPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(40, trumpet.calculateMarkup());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canGetDescription() {
        assertEquals("trumpet", trumpet.getDescription());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(MaterialType.WOOD, trumpet.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(ColourType.BROWN, trumpet.getColour());
    }

    @Test
    public void canGetFamily() {
        assertEquals(FamilyType.BRASS, trumpet.getFamily());
    }

    @Test
    public void canPlay() {
        assertEquals("parp", trumpet.play());
    }


}
