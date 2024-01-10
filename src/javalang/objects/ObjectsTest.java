package javalang.objects;

import java.util.*;
import static java.util.Objects.*;

public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.print("str2D = {");
        for (String[] tmp : str2D) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("}");

        System.out.print("str2D_2 = {");
        for (String[] tmp : str2D_2) {
            System.out.print(Arrays.toString(tmp));
        }
        System.out.println("{");
        System.out.println();

        System.out.println("equals(str2D, str2D_2) = "
                + Objects.equals(str2D, str2D_2));
        System.out.println("deepEquals(str2D, str2D_2) = "
                + deepEquals(str2D, str2D_2));
        System.out.println();

        System.out.println("isNull(null) = " + isNull(null));
        System.out.println("nonNull(null)" + nonNull(null));
        System.out.println();
        System.out.println("Objects.hashCode(null) = " + Objects.hashCode(null));
        System.out.println("Objects.toString(null)" + Objects.toString(null));
        System.out.println("Objects.toString(null, \"\")" + Objects.toString(null, ""));

        System.out.println();
        Comparator c = String.CASE_INSENSITIVE_ORDER;   // 대소문자 구분하지 않고 비교하겠다.

        System.out.println("compare(\"aa\", \"bb\", c)" + compare("aa", "bb", c));
        System.out.println("compare(\"bb\", \"aa\", c)" + compare("bb", "aa", c));
        System.out.println("compare(\"ab\", \"AB\", c)" + compare("ab", "AB", c));
    }
}
