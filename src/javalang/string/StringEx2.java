package javalang.string;

public class StringEx2 {
    public static void main(String[] args) {
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";
        String s4 = "BBB";
        // 같은 내용의 문자열 리터럴은 한번만 저장된다.

        // String 리터럴들은 컴파일 시에 클래스 파일에 저장된다.
        // "AAA" 를 담고 있는 String 인스턴스가 하나 생성된 후, 참조 변수 s1, s2, s3는 모두 이 String 인스턴스를 참조하게 된다.
    }
}
