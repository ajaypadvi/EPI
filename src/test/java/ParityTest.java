import chapter05.primitive.types.Parity;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParityTest {

    @Test
    public void testSetBitsCount() {
        int count = Parity.countBits(30);
        assertEquals(4, count);

        count = Parity.countBits(60);
        assertEquals(4, count);

        count = Parity.countBits(16);
        assertEquals(1, count);
    }

    @Test
    public void testParityUsingModulo() {
        int parity = Parity.parity(30);
        assertEquals(0, parity);

        parity = Parity.parity(60);
        assertEquals(0, parity);

        parity = Parity.parity(16);
        assertEquals(1, parity);
    }

    @Test
    public void testParityUsingXOR() {
        int parity = Parity.parity1(30);
        assertEquals(0, parity);

        parity = Parity.parity1(60);
        assertEquals(0, parity);

        parity = Parity.parity1(16);
        assertEquals(1, parity);
    }

    @Test
    public void testParity() {
        int parity = Parity.parity2(30);
        assertEquals(0, parity);

        parity = Parity.parity2(60);
        assertEquals(0, parity);

        parity = Parity.parity2(16);
        assertEquals(1, parity);
    }
}
