package instruments;

import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before() {
        triangle = new Triangle(6, 10, MaterialType.METAL, ColourType.SILVER,15);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(6, triangle.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10, triangle.getSellPrice());
    }

    @Test
    public void canGetLengthInCm() {
        assertEquals(15, triangle.getLengthInCm());
    }

    @Test
    public void canGetDescription() {
        assertEquals("triangle", triangle.getDescription());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(4, triangle.calculateMarkup());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(MaterialType.METAL, triangle.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals(ColourType.SILVER, triangle.getColour());
    }

    @Test
    public void canGetFamily() {
        assertEquals(FamilyType.PERCUSSION, triangle.getFamily());
    }

    @Test
    public void canPlay() {
        assertEquals("ping", triangle.play());
    }


}
