package javalang.stringTokenizer;

import java.util.StringTokenizer;

// 두 개의 토큰을 사용해서 처리하는 방법!
public class StringTokenizerEx3 {
    public static void main(String[] args) {
        String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
        StringTokenizer st = new StringTokenizer(source, "|");
        while (st.hasMoreElements()) {
            String token = st.nextToken();

            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreElements()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("------");
        }
    }
}
