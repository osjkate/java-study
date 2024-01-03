package exception.exceptionex;

// try-catch 문에서의 흐름
// 오류가 발생하면 바로 catch 블럭으로 분기 try-catch 문을 완전히 빠져나간다.
public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
