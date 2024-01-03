package exception.exceptionex;

public class ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (Exception e) { // Exception 클래스 타입의 참조변수를 선언해놓으면 모든 예외 처리 가능
            System.out.println(5);
        }
        System.out.println(6);
    }
}
