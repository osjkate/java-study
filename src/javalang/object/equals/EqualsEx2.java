package javalang.object.equals;



public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(80L);
        Person p2 = new Person(80L);
        if (p1 == p2) {
            System.out.println("p1과 p2는 같은 사람입니다. ");
        } else System.out.println("p1과 p2는 다른 사람입니다. ");
        if(p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다. ");
        } else System.out.println("p1과 p2는 다른 사람입니다. ");
    }
}

class Person {
    long id;

    Person(long id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person)obj).id;
        } else return false;
    }
    // String class 도 equals가 오버라이딩 되어있다. -> 객체 주소를 비교하는 것이 아니라 문자열 값을 비교하도록
}
