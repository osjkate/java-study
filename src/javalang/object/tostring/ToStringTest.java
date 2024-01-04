package javalang.object.tostring;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        String str = new String("KOREA");
        Date today = new Date();

        System.out.println(str);
        System.out.println(str.toString());
        // String 인스턴스가 가진 문자열을 반환하도록 오버라이딩 됨

        System.out.println();
        System.out.println(today);
        System.out.println(today.toString());
        // Date 인스턴스가 가진 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 됨
    }
}
