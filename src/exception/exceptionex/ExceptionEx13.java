package exception.exceptionex;

public class ExceptionEx13 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 예외가 처리됨");
            e.printStackTrace();
        }
    }
}
