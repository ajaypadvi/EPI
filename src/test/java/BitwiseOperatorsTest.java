import org.junit.Test;

import static org.junit.Assert.*;

public class BitwiseOperatorsTest {

    private int a = 15; // 0000 1111
    private int b = 27; //‭ 0001 0111‬

    @Test
    public void testBitwiseAND() {
        int and = a & b;
        assertEquals(11, and);
        System.out.println("and:" + and);
    }

    @Test
    public void testBitwiseOR() {
        int or = a | b;
        assertEquals(31, or);
        System.out.println("or:" + or);
    }

    @Test
    public void testBitwiseXOR() {
        int xor = a ^ b;
        assertEquals(20, xor);
        System.out.println("xor:" + xor);
    }

    @Test
    public void testBitwiseNOT() {
        int not = ~a;
        assertEquals(-16, not);
        System.out.println("not:" + not);
    }

    @Test
    public void shiftLeft() {
        int shiftedLeftByTwo = a << 2;
        assertEquals(shiftedLeftByTwo, 60);
        System.out.println("leftshift:" + shiftedLeftByTwo);
    }

    @Test
    public void shiftRight() {
        int shiftedRightByTwo = a >> 2;
        assertEquals(3, shiftedRightByTwo);
        System.out.println("rightshift:" + shiftedRightByTwo);
    }

    @Test
    public void shiftRightZeroFill() {
        int shiftedRightByTwo = a >>> 2;
        assertEquals(3, shiftedRightByTwo);
        System.out.println("righzerofill:" + shiftedRightByTwo);
    }
}
