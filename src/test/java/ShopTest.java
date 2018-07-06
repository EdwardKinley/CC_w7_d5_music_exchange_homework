import instruments.Guitar;
import instruments.Piano;
import instruments.Trumpet;
import instruments.instrumentproperties.ColourType;
import instruments.instrumentproperties.MaterialType;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;
import othersaleitems.OtherSaleItem;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Guitar guitar;
    Piano piano;
    ArrayList<ISell> instruments;
    Trumpet trumpet;
    OtherSaleItem shades;
    OtherSaleItem fedora;
    OtherSaleItem guitarStrings;
    ArrayList<ISell> items;

    @Before
    public void before() {
        stock = new ArrayList<>();
        shop = new Shop("Ray's Music Exchange II", 1000, stock);
        guitar = new Guitar(200, 250, MaterialType.WOOD, ColourType.BROWN, 12);
        piano = new Piano(1200, 1600, MaterialType.WOOD, ColourType.WHITE, 88);
        instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(piano);
        trumpet = new Trumpet(180, 250, MaterialType.METAL, ColourType.BRONZE, 3);
        shades = new OtherSaleItem(10, 15, "dark shades");
        fedora = new OtherSaleItem(15, 22, "black fedora");
        guitarStrings = new OtherSaleItem(4, 7, "Pro Arte high tension classical guitar string set (6 strings)");
        items = new ArrayList<>();
        items.add(trumpet);
        items.add(shades);
        items.add(fedora);
        items.add(guitarStrings);
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Exchange II", shop.getName());
    }

    @Test
    public void canGetTillBlance() {
        assertEquals(1000, shop.getTillBalance());
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

    @Test
    public void canRemoveStockMultiple() {
        shop.addStockMultiple(items);
        ArrayList<ISell> itemsToRemove = new ArrayList<>();
        itemsToRemove.add(fedora);
        itemsToRemove.add(shades);
        shop.removeStockMultiple(itemsToRemove);
        assertEquals(2, shop.getStockNumber());
    }

    @Test
    public void canGetPotentialProfit() {
        shop.addStockMultiple(items);
        assertEquals(85, shop.getPotentialProfit());
    }


}
