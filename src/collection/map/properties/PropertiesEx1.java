package collection.map.properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        // 키(String), 값(String) 저장
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
//        prop.setProperty("size", 10);     String, String이어야 함.
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while (e.hasMoreElements()) {
            String element = (String) e.nextElement();
            System.out.println(element + " : " + prop.getProperty(element));
        }
        System.out.println();
        prop.setProperty("size", "20");
        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity = " + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
        System.out.println(prop);
        // {size=20, language=kr, timeout=30, capacity=10}

        prop.list(System.out);
        /*
        * size=20
        * language=kr
        * timeout=30
        * capacity=10
        */
    }
}
