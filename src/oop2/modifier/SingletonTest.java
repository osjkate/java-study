package oop2.modifier;

public class SingletonTest {
    public static void main(String[] args) {
        // Singleton s = new Singleton(); 에러 발생: 같은 클래스가 아니라 생성자 호출 불가
        Singleton s = Singleton.getInstance();
    }
}

final class Singleton {
    private static Singleton s = new Singleton();

    // 같은 클래스 안에서만 생성자 호출 가능!
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (s == null) s = new Singleton();
        return s;
    }
}
