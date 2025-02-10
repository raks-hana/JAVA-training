class PrimitiveAndReference {
    static void modifyValues(int num, int[] arr) {
        num = 150;  
        arr[0] = 100;  
    }

    public static void main(String[] args) {
        int number = 50;  
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Before method call:");
        System.out.println("Number: " + number);
        System.out.println("Array: " + java.util.Arrays.toString(array));

        modifyValues(number, array);

        System.out.println("\nAfter method call:");
        System.out.println("Number: " + number);  
        System.out.println("Array: " + java.util.Arrays.toString(array));  
    }
}
