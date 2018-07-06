import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;
    ArrayList<ISell> stock;

    @Before
    public void before() {
        stock = new ArrayList<>();
        shop1 = new Shop("Ray's Music Exchange II", stock);
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Exchange II", shop1.getName());
    }

    @Test
    public void beginsWithNoStock() {
        assertEquals(0, shop1.getStock().size());
    }


}
