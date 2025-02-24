package task1;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        //int[] arr3 = arr1;

        System.out.println("Using equals() for arr1 and arr2: " + arr1.equals(arr2)); 
        //System.out.println("Using equals() for arr1 and arr3: " + arr1.equals(arr3));

        System.out.println("Using deepEquals() for arr1 and arr2: " + 
                           Arrays.deepEquals(new Object[]{arr1}, new Object[]{arr2})); 
    }
}
