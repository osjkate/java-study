package oop2.innerclass;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // static클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//        int siv = outerIv;
        InnerEx3 ie3 = new InnerEx3();
        int siv = ie3.outerIv;  // 접근하려면 객체 생성 후 접근해야 함.

        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        // 편의상 final을 생략한 것으로 처리하고 자동으로 final을 붙여준다.
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;

            //외부 클래스의 지역변수는 final이 붙은 상수만 가능하다(JDK 1.8이후는 final 생략해도 가능함)
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
