package javalang.bigIntegerDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static java.math.RoundingMode.*;

public class BigDecimalEx {
    public static void main(String[] args) throws Exception{
        BigDecimal bd1 = new BigDecimal("123.456");
        BigDecimal bd2 = new BigDecimal("1.0");

        System.out.print("bd1 = " + bd1);
        System.out.print(", \tvalue = " + bd1.unscaledValue());
        System.out.print(", \tscale = " + bd1.scale());
        System.out.print(", \tprecision = " + bd1.precision());
        System.out.println();

        System.out.print("bd2 = " + bd2);
        System.out.print(", \tvalue = " + bd2.unscaledValue());
        System.out.print(", \tscale = " + bd2.scale());
        System.out.print(", \tprecision = " + bd2.precision());
        System.out.println();

        BigDecimal bd3 = bd1.multiply(bd2);
        System.out.print("bd3 = " + bd3);
        System.out.print(", \tvalue = " + bd3.unscaledValue());
        System.out.print(", \tscale = " + bd3.scale());
        System.out.print(", \tprecision = " + bd3.precision());
        System.out.println();

        System.out.println(bd1.divide(bd2, 2, HALF_UP));
        System.out.println(bd1.setScale(2, HALF_UP));
        // 크기는 변하지 않고 자릿수만 변함
        System.out.println(bd1.divide(bd2, new MathContext(2, HALF_UP)));
    }
}
