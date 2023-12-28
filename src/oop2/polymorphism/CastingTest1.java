package oop2.polymorphism;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water();  에러
        fe2 = (FireEngine)car;
        fe2.water();

        // 인스턴스는 그대로 있고, 참조값만 바뀌는거임!!

//        Car car2 = new Car();
//        FireEngine fe3 = (FireEngine) car2;
//        fe3.water();
        // 인스턴스 자체가 조상 인스턴스이면 형변환 불가! castError 발생함
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brr");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!");
    }
}
