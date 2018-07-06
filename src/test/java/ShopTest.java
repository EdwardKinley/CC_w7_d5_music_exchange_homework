import instruments.Guitar;
import instruments.Piano;
import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.FamilyType;
import instruments.instrumentproperties.MaterialType;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Guitar guitar;
    Piano piano;
    ArrayList<ISell> instruments;

    @Before
    public void before() {
        stock = new ArrayList<>();
        shop = new Shop("Ray's Music Exchange II", stock);
        guitar = new Guitar(200, 250, MaterialType.WOOD, ColourType.BROWN, 12);
        piano = new Piano(1200, 1600, MaterialType.WOOD, ColourType.WHITE, 88);
        instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(piano);
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Exchange II", shop.getName());
    }

    @Test
    public void beginsWithNoStock() {
        assertEquals(0, shop.getStock().size());
        assertEquals(0, shop.getStockNumber());
    }

    @Test
    public void canAddStockSingle() {
        shop.addStockSingle(guitar);
        assertEquals(1, shop.getStockNumber());
    }

    @Test
    public void canAddStockMultiple() {
        shop.addStockMultiple(instruments);
        assertEquals(2, shop.getStockNumber());
    }

    @Test
    public void canRemoveStockSingle() {
        shop.addStockMultiple(instruments);
        shop.removeStockSingle(guitar);
        assertEquals(1, shop.getStockNumber());
    }


}
