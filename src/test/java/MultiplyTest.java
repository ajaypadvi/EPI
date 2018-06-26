import chapter05.primitive.types.Multiply;
import org.junit.Test;

import java.util.Random;

import static chapter05.primitive.types.Multiply.multiply;
import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void test() {
        long a = 13;
        long b = 9;
        long expected = a * b;
        long result = multiply(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void testRandom() {
        Random r = new Random();
        // Random test, only works if the product is not greater than 2^32 - 1.
        for (int i = 0; i < 100000; ++i) {
            long x = r.nextInt(65535), y = r.nextInt(65535);
            //long x = r.nextInt(),y=r.nextInt(); This works
            //long x = r.nextLong(),y=r.nextLong(); This also works
            long prod = multiply(x, y);
            assertEquals((long) x * y, prod);
            System.out.println("PASS: x = " + x + ", y = " + y + "; prod = "
                    + prod);
        }
    }
}
