package oop2.innerclass;

public class InnerEx2 {
    class InstanceInner {

    }

    static class StaticInner {

    }

    InstanceInner iv = new InstanceInner();
    StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner();
//        static 멤버는 인스턴스 멤버에 직접 접근할 수 없다.
        StaticInner obj2 = new StaticInner();

        // 굳이 인스턴스멤버에 접근하려면 객체를 먼저 생성해야 함.
        // 인스턴스 클래스는 외부 클래스를 먼저 생성해야 생성 가능
        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }

    void myMethod() {
//        LocalInner lv = new LocalInner();
    }

}


