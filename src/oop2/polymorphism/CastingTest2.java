package oop2.polymorphism;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
//        fe = (FireEngine)car;
//        // 컴파일 시에는 오류가 없지만 실행하면 오류 발생!
//        fe.drive();
//        car2 = fe;
//        car2.drive();
    }
}
