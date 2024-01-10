package javalang.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i == i2 ? " + (i == i2));
        System.out.println("i.equals(i2) ? " + i.equals(i2));   // 래퍼 클래스들은 모두 값을 비교하는 것으로 오버라이딩 되어 있음 (주소값이 아니라)
        System.out.println("i.compareTo(i2) ? " + i.compareTo(i2));
        System.out.println("i.toString() ? " + i.toString());   // 래퍼 클래스들의 toString()은 모두 값을 문자열로 반환하는 함수로 오버라이딩 되어 있다.
        System.out.println();

        // 래퍼 클래스가 가진 상수
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Integer.SIZE + "bits");
        System.out.println("BYTES = " + Integer.BYTES + "bytes");
        System.out.println("TYPE = " + Integer.TYPE);

        int integer = Integer.valueOf("100"); // 오토박싱으로 차이가 없어지긴 했지만 경고 뜸
        Integer integer2 = Integer.valueOf("100");
    }

}
