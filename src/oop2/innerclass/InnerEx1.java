package oop2.innerclass;

public class InnerEx1 {
    class InstanceInner {
        int iv = 100;
        static int cv = 100;
        // 에러지만 컴파일 에러는 발생하지 않음
        static final int CONST = 100;
    }

    static class StaticInner {
        int iv = 100;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            static int cv = 300;
            // 이거 그냥 인스턴스 변수로 취급됨 에러는 발생하지 않음!
            static final int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(InstanceInner.cv);
        System.out.println(StaticInner.cv);
    }
}
