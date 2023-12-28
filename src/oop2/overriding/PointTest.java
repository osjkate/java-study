package oop2.overriding;

public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

class Point3D extends Point {
    int z;
    Point3D(int x, int y, int z) {
        // 안쓰면 자동으로 super();를 실행한다. 이 때 Point() 생성자가 없으면 오류 발생
        // 따라서 Point()가 없으면 super(x, y)를 추가해주어야 함.
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + ", z : " + z;
    }
}
