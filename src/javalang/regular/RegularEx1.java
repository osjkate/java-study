package javalang.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.",
                "c0", "car", "combat", "count", "date", "disc"};

        Pattern p = Pattern.compile("c[a-z]*");
        // 정규식을 매개변수로 하는 compile 함수 -> Pattern 인스턴스 얻기

        for (int i = 0; i < data.length; i++) {
            Matcher m = p.matcher(data[i]);
            // 비교할 대상을 매개변수로 하는 matcher 함수 -> Matcher 인스턴스 얻기
            if (m.matches()) {
                System.out.print(data[i] + ", ");
            }
        }
    }
}
