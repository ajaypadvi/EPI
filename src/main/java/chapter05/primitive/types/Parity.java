package chapter05.primitive.types;

/**
 * This class contains the brute force algorithms to calculate the parity of given bit representation
 */
public class Parity {
    /**
     * Counts the number of set bits in integer type
     *
     * @param x
     * @return number of set bits to 1
     */
    public static short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1; //x=x>>>1;
        }
        return numBits;
    }

    /**
     * Calculate the parity of teh binary word
     * Parity is 1 when number of bits set are odd
     * and 0 otherwise
     *
     * @param x
     * @return number of set bits to 1
     * <p>
     * The brute-force algorithm iteratively tests the value of each bit while tracking the number
     * of 1s seen so far. Since we only care if the number of 1s is even or odd, we can return the number modulo 2.
     */
    public static short parity(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1; //x=x>>>1;
        }
        return (short) (numBits % 2);
    }

    /**
     * Calculate teh parity of teh binary word
     * Parity is 1 when number of bits set are odd
     * and 0 otherwise
     *
     * @param x
     * @return number of set bits to 1
     * <p>
     * The brute-force algorithm iteratively tests the value of each bit while tracking the number
     * of 1s seen so far.
     */
    public static short parity1(int x) {
        short parity = 0;
        while (x != 0) {
            parity ^= (x & 1);
            x >>>= 1; //x=x>>>1;
        }
        return parity;
    }

    /**
     * A solution which runs in O(k) time complexity where k is the number of the bits set to 1 in binary word
     *
     * @param x
     * @return
     */
    public static short parity2(long x) {
        short result = 0;
        while (x != 0) {
            result ^= 1;
            x &= (x - 1); // Drops the lowest set bit of x.
        }
        return result;
    }
}
