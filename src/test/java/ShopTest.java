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

    Shop shop1;
    ArrayList<ISell> stock;
    Guitar guitar;
    Piano piano;

    @Before
    public void before() {
        stock = new ArrayList<>();
        shop1 = new Shop("Ray's Music Exchange II", stock);
        guitar = new Guitar(200, 250, MaterialType.WOOD, ColourType.BROWN, 12);
//        piano = new Piano()
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Exchange II", shop1.getName());
    }

    @Test
    public void beginsWithNoStock() {
        assertEquals(0, shop1.getStock().size());
        assertEquals(0, shop1.getStockNumber());
    }

    @Test
    public void canAddStockSingle() {
        shop1.addStockSingle(guitar);
        assertEquals(1, shop1.getStockNumber());
    }

//    @Test
//    public void canAddStockMultiple() {
//
//    }


}
