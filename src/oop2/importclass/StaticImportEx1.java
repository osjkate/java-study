package oop2.importclass;

// static 멤버를 사용할 때 편리하다.
import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImportEx1 {
    public static void main(String[] args) {
//        System.out.println(Math.random());
        out.println(random());

//        System.out.println("Math.PI : " + Math.PI);
        out.println("Math.PI : " + PI);
    }
}
