package othersaleitems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherSaleItemTest {

    OtherSaleItem drumsticks;

    @Before
    public void before() {
        drumsticks = new OtherSaleItem(8, 10, "drumsticks");
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(8, drumsticks.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10, drumsticks.getSellPrice());
    }

    @Test
    public void canGetDescription() {
        assertEquals("drumsticks", drumsticks.getDescription());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2, drumsticks.calculateMarkup());
    }

}
