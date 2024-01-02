package oop2.interfaceTest;

public class interfaceTest {
    public static void main(String[] args) {
        A a = new A();
//        a.methodA(new B());
        a.methodA();
    }
}

class interfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}

class A {
    public void methodA() {
//        b.methodB();
        I2 i2 = InstanceManager.getInstance();
        i2.methodN();
        System.out.println(i2.toString());
    }
    void autoPlay(I i) {
        i.play();
    }
}
class B implements I, I2{
    public void methodB() {
        System.out.println("methodB()");
    }

    @Override
    public void play() {
        System.out.println("play in B class");
    }

    @Override
    public void methodN() {
        System.out.println("methodN() in B class");
    }

    public String toString() {
        return "class B";
    }
}

class C implements I, I2 {
    @Override
    public void play() {
        System.out.println("play in C class");
    }

    public String toString() {
        return "class C";
    }

    @Override
    public void methodN() {
        System.out.println("methodN in C class");
    }
}

interface I {
    void play();
}

interface I2 {
    public abstract void methodN();
}

class InstanceManager {
    public static I2 getInstance() {
//        return new B();
        return new C();
    }
}

