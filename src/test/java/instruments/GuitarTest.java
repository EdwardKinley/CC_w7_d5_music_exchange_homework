package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(100, 140, 6);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(100, guitar.getPrice());
    }

}
