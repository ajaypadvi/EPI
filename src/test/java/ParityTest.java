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
        int parity = Parity.parityBitByBit(30);
        assertEquals(0, parity);

        parity = Parity.parityBitByBit(60);
        assertEquals(0, parity);

        parity = Parity.parityBitByBit(16);
        assertEquals(1, parity);
    }

    @Test
    public void testParityUsingXOR() {
        int parity = Parity.parityBitByBitUsingXOR(30);
        assertEquals(0, parity);

        parity = Parity.parityBitByBitUsingXOR(60);
        assertEquals(0, parity);

        parity = Parity.parityBitByBitUsingXOR(16);
        assertEquals(1, parity);
    }

    @Test
    public void testParity() {
        int parity = Parity.parityBitByBitSmart(30);
        assertEquals(0, parity);

        parity = Parity.parityBitByBitSmart(60);
        assertEquals(0, parity);

        parity = Parity.parityBitByBitSmart(16);
        assertEquals(1, parity);
    }

    @Test
    public void testParityUsingXORAssociativity() {
        int parity = Parity.parityAssoc(30);
        assertEquals(0, parity);

        parity = Parity.parityAssoc(60);
        assertEquals(0, parity);

        parity = Parity.parityAssoc(16);
        assertEquals(1, parity);
    }
}
