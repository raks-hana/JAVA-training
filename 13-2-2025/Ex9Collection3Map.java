package Techmm1;

import java.util.*;

public class CollectionThree {
    public static void main(String[] args) {
        Map<Integer, String> hm = new Hashtable<>();
        Map<Integer, String> lhm = new LinkedHashMap<>();
        Map<Integer, String> tm = new TreeMap<>();
        hashMapSample(hm);
        linkedMapSample(lhm);
        treeMapSample(tm);
    }

// HashMap<Integer, String> hm = new HashMap<>();
    public static void hashMapSample(Map< Integer, String > hm) {
            hm.put(1, "one");
            hm.put(2, "two");
            hm.put(3, "three");
            System.out.println("Initial HashMap hm are : " + hm);
            hm.put(2, "apple");
            System.out.println("Updated Map " + hm);
            hm.remove(2);
            System.out.println("Mappings after removal are : " + hm);
            System.out.println("Map traversal:");
            for (Map.Entry<Integer, String> e : hm.entrySet())
                System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
    public static void linkedMapSample(Map< Integer,String > lhm) {
        lhm.put(4, "four");
        lhm.put(5, "five");
        lhm.put(6, "six");
        System.out.println("Initial LinkedHashMap lhm are : " + lhm);
        lhm.put(5, "banana");
        System.out.println("Updated Map " + lhm);
        lhm.remove(5);
        System.out.println("Mappings after removal are : " + lhm);
        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : lhm.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
    public static void treeMapSample(Map< Integer,String > tm) {
        tm.put(7, "seven");
        tm.put(8, "eight");
        tm.put(9, "nine");
        System.out.println("Initial treeMap tm are : " + tm);
        tm.put(8, "orange");
        System.out.println("Updated Map " + tm);
        tm.remove(8);
        System.out.println("Mappings after removal are : " + tm);
        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : tm.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }

}
