package exception.exceptionex;

public class ExceptionEx14 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception e) {
        System.out.println("main 예외가 처리됨");
        e.printStackTrace();
    }
    }

    static void method1() throws Exception{
        throw new Exception();

    }
}
