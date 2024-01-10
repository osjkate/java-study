package javalang.math;

import static java.lang.Math.*;

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        System.out.println("i = " + i);
        System.out.println("-i = " + (-i));

        System.out.printf("negateExact(%d) = %d%n", i, negateExact(i));
        try {
            System.out.printf("negateExact(%d) = %d%n", 10, negateExact(10));
            System.out.printf("negateExact(%d) = %d%n", -10, negateExact(-10));
            System.out.printf("negateExact(%d) = %d%n", i + 1, negateExact(i + 1));
        } catch (ArithmeticException e) {
            System.out.printf("negateExact(%d) = %d%n", (long)i + 1, negateExact((long)i + 1));
        }
    }
}
