package javalang.string;

public class StringEx3 {
    public static void main(String[] args) {
        char[] cArr = {'c', 'h', 'a', 'r'};
        String s = new String(cArr);
        System.out.println(s);
        // 문자 배열을 매개변수로 입력하면 연결해서 문자열 만들어서 반환한다.

        char[] cArr2 = new char[0];
        String s2 = new String(cArr2);
        System.out.println("cArr2.length : " + cArr2.length);
        System.out.println("@@@" + s2 + "@@@");
    }
}
