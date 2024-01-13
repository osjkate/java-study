package collection.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Set set = new HashSet();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        // list 는 순서가 있음

        set.add("4");
        set.add("2");
        set.add("3");
        set.add("1");
        set.add("5");
        // set 는 순서가 없음

        Iterator it = list.iterator();
        Iterator it2 = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
    }
}
