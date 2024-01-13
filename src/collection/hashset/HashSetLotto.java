package collection.hashset;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (; set.size() < 6;) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(new Integer(num));
        }
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
