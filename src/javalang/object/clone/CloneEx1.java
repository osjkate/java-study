package javalang.object.clone;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point p2 = (Point) original.clone();

        System.out.println(original);
        System.out.println(p2);
    }
}

// Cloneable 인터페이스를 구현한 클래스에서만 clone()를 사용할 수 있다. (아니면 예외 발생)
class Point implements Cloneable{
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
    
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return obj;
    }
}
