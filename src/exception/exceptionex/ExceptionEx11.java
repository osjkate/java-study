package exception.exceptionex;

public class ExceptionEx11 {
    public static void main(String[] args) {
        throw new RuntimeException();
        // 성공적으로 컴파일은 됨
        // 프로그래머의 실수로 발생하는 예외들 -> 예외처리를 강제하지 않음

        // 컴파일러가 예외처리를 확인하는 Exception 클래스 : 'checked 예외'
        // 컴파일러가 예외처리를 확인하지 않는 RuntimeException 클래서 : 'unchecked 예외'
    }
}
