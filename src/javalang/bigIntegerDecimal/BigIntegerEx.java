package javalang.bigIntegerDecimal;

import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.printf("%d!=%s%n", i, calcFactorial(i));

        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
