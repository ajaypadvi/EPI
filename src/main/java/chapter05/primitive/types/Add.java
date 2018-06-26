package chapter05.primitive.types;

public class Add {
    public static long add(long a, long b) {
        long sum = 0, carryin = 0, k = 1, tempA = a, tempB = b;
        while (tempA != 0 || tempB != 0) {
            long ak = a & k, bk = b & k;
            long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
            sum |= (ak ^ bk ^ carryin);
            carryin = carryout << 1;
            k <<= 1;
            // clang-format off
            tempA >>>= 1;
            tempB >>>= 1;
            // clang-format on
        }
        return sum | carryin;
    }
}
