package exception.exceptionex;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {

            } catch (Exception e) {

            }
        } catch (Exception e){
            // try {   } catch (Exception e) { }    // 에러 발생 : 변수 e가 중복 선언됨
            try {

            } catch (Exception e2) {

            }
        }

        try {

        } catch (Exception e){

        }
    }
}
