package javalang.object.hashcode;

public class HashCodeEx1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        // String 클래스의 hashCode는 동일한 문자열이면 동일한 해시코드를 반환하도록 오버라이딩 되어있음 -> str1과 str2의 해시코드가 같다.

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        // System.identityHashCode는 객체의 주소값으로 해시코드를 생성함 -> str1과 str2의 해시코드가 다르다.
    }
}
