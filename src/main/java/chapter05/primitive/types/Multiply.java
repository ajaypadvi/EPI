package chapter05.primitive.types;

public class Multiply {

    public static long multiply(long x, long y) {
        long sum = 0;
        while (x != 0) {
            //Examine each bit x
            if ((x & 1) != 0) {
                sum = Add.add(sum, y);
            }

            x >>>= 1;
            y <<= 1;
        }
        return sum;
    }
}
