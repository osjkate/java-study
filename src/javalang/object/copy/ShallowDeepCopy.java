package javalang.object.copy;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);

        c1.p.x = 9;
        c2.p.y = 9;
        System.out.println("--- c1의 변경 후 ---");
        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        // 얕은 복사는 단순히 참조 값만 복사하기 때문에 원본 변수가 참조하고 있는 객체의 값이 변경되면 함께 변경된다.
        System.out.println("c3 : " + c3);
        // 갚은 복사는 새로운 객체가 생성되고 값이 복사 되기 때문에 원본 변수가 참조하고 있는 객체의 값이 변경되어도 변경되지 않는다.
    }
}

class Circle implements Cloneable {
   Point p;
   double r;
    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle) obj;
    }

    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y);
        return c;
    }

    public String toString() {
        return "[p = " + p + ", r = " + r + "]";
    }
}

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

