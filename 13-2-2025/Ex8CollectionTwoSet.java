package Techmm1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsTwo {
    public static void main(String a[]) {
        Set<Integer> hs = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();
        Set<Double> ts = new TreeSet<>();
        hashsetSample(hs);
        linkedsetSample(lhs);
        treesetSample(ts);
    }

    public static void hashsetSample(Set<Integer> hs) {
        hs.add(7);
        hs.add(16);
        hs.add(14);
        hs.add(49);
        hs.add(89);
        hs.add(56);
        hs.add(42);
        hs.add(70);
        System.out.println("The elements in Hashset are: " + hs);
        hs.remove(7);
        System.out.println("The elements in Hashset after removing a element: " + hs);
        System.out.println("The elements divisible by 7 are: ");
        for (Integer i : hs) {
            if (i % 7 == 0) {
                System.out.print(" " + i + " ");
            }
        }
    }
    public static void linkedsetSample (Set < String > lhs) {
        lhs.add("hi");
        lhs.add("apple");
        lhs.add("banana");
        lhs.add("orange");
        lhs.add("hi");
        lhs.add("abstraction");
        lhs.add("encapsulation");
        lhs.add("inheritance");
        System.out.println("The elements in LinkedHashset are: "+lhs);
        lhs.remove("hi");
        System.out.println("The elements in LinkedHashset after removing a element: "+lhs);
        System.out.println("The elements which have size more than 5: ");
        for (String s : lhs) {
            if(s.length()>5){
                System.out.print(" "+s+" ");
            }
        }
    }
    public static void treesetSample (Set < Double >ts) {
        ts.add(7.14);
        ts.add(22.222222);
        ts.add(33.333333);
        ts.add(44.444444);
        ts.add(55.555555);
        ts.add(66.666666);
        ts.add(3.14);
        ts.add(2.679078);
        System.out.println("The elements in Treeset are: "+ts);
        ts.remove(3.14);
        System.out.println("The elements in Treeset after removing a element: "+ts);
        System.out.println("The elements which are greater than 20: ");
        for (Double d : ts) {
            if(d>20){
                System.out.print(" "+d+" ");
            }
        }
    }
}

