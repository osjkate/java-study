package oop1;

// 다른 패키지에 같은 이름의 클래스가 존재할 수 있다.
public class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
