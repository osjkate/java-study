package collection.map.treemap;

import java.util.*;

public class TreeSetEx1 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

        TreeMap map = new TreeMap();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], new Integer(value.intValue() + 1));
            } else {
                map.put(data[i], new Integer(1));
            }
        }

        Iterator it = map.entrySet().iterator();

        // 결과를 보면 HashMap과는 다르게 키 오름차순으로 정렬되었음을 볼 수 있다.
        System.out.println("= 기본정렬 =");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
        System.out.println();

        //map을 ArrayList로 반환한 다음에 Collections.sort()로 정렬
        Set set = map.entrySet();
        List list = new ArrayList(set);

        Collections.sort(list, new ValueComparator());

        it = list.iterator();

        System.out.println("= 값의 크기가 큰 순서로 정렬 =");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = ((Integer) entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
        }
    }
    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar);
    }
    static class ValueComparator implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;

                int v1 = ((Integer) e1.getValue()).intValue();
                int v2 = ((Integer) e2.getValue()).intValue();
                return v2 - v1;
            }
            return -1;
        }
    }
}


