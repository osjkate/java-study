package exception.exceptionex;

// try-catch 문에서의 흐름
// 오류가 발생하지 않으면 catch 블럭 안의 문장들은 실행되지 않는다.
public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
