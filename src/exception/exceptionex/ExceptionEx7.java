package exception.exceptionex;

public class ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");    // 첫 번째 블록을 수행하고 try-catch문을 빠져나가기 때문에 실행되지 않는 블럭
        }
        System.out.println(6);
    }
}
