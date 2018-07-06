package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone(500, 650, MaterialType.METAL, ColourType.BRONZE,22);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(500, saxophone.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(650, saxophone.getSellPrice());
    }

    @Test
    public void canGetNumberOfToneHoles() {
        assertEquals(22, saxophone.getNumberOfToneHoles());
    }

    @Test
    public void canGetDescription() {
        assertEquals("saxophone", saxophone.getDescription());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(150, saxophone.calculateMarkup());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(MaterialType.METAL, saxophone.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(ColourType.BRONZE, saxophone.getColour());
    }

    @Test
    public void canGetFamily() {
        assertEquals(FamilyType.WOODWIND, saxophone.getFamily());
    }

    @Test
    public void canPlay() {
        assertEquals("wow", saxophone.play());
    }


}
