import chapter05.primitive.types.Add;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AddTest {
    @Test
    public void test() {
        long result = Add.add(13, 9);
        assertEquals(22, result);
    }

    @Test
    public void testRandom() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            long a = random.nextLong();
            long b = random.nextLong();
            long expected = a + b;
            long result = Add.add(a, b);
            assertEquals(expected, result);
        }
    }
}
