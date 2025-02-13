package Techmm1;

import java.util.*;

public class CollectionsOne {
    public static void main(String[] args) {
        ArrayListOne listOne = new ArrayListOne();
        listOne.start();
        LinkedListOne linkedListOne = new LinkedListOne();
        linkedListOne.start();
        StackOne stackOne = new StackOne();
        stackOne.start();
        VectorOne vectorOne = new VectorOne();
        vectorOne.start();
    }
}
class ArrayListOne extends Thread {
    public void run(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Is the array list empty "+list.isEmpty());
        System.out.println("The elements are: "+list);
        System.out.println("The total no. of elements is: "+list.size());
        System.out.println("The first element is: "+list.get(0));
        System.out.println("Is the element "+list.get(2)+" present in the list: "+list.contains(list.get(2)));
        System.out.println("Removed element is: "+list.remove(3));
        System.out.println("List after Removed element is: "+list);
    }
}
class LinkedListOne extends Thread {
    public void run(){
        List<String> list = new LinkedList<>();
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        System.out.println("Is the linked list empty "+list.isEmpty());
        System.out.println("The elements are: "+list);
        System.out.println("The total no. of elements is: "+list.size());
        System.out.println("The first element is: "+list.get(0));
        System.out.println("Is the element "+list.get(2)+" present in the list: "+list.contains(list.get(2)));
        System.out.println("Removed element is: "+list.remove(3));
        System.out.println("List after Removed element is: "+list);
    }
}
class StackOne extends Thread {
    public void run(){
        List<String> list = new Stack<>();
        list.add("I");
        list.add("J");
        list.add("K");
        list.add("L");
        System.out.println("Is the stacked list empty "+list.isEmpty());
        System.out.println("The elements are: "+list);
        System.out.println("The total no. of elements is: "+list.size());
        System.out.println("The first element is: "+list.get(0));
        System.out.println("Is the element "+list.get(2)+" present in the list: "+list.contains(list.get(2)));
        System.out.println("Removed element is: "+list.remove(3));
        System.out.println("List after Removed element is: "+list);
    }
}
class VectorOne extends Thread {
    public void run(){
        List<String> list = new Vector<>();
        list.add("M");
        list.add("N");
        list.add("O");
        list.add("P");
        System.out.println("Is the vectored list empty "+list.isEmpty());
        System.out.println("The elements are: "+list);
        System.out.println("The total no. of elements is: "+list.size());
        System.out.println("The first element is: "+list.get(0));
        System.out.println("Is the element "+list.get(2)+" present in the list: "+list.contains(list.get(2)));
        System.out.println("Removed element is: "+list.remove(3));
        System.out.println("List after Removed element is: "+list);
    }
}
