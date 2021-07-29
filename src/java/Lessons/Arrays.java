package Lessons;

public class Arrays {
    public static void main(String[] args) {
        // Types of arrays in Java:
        //int[], double[], char[], String[].

        // How to create an array?

        // Method 1:
        int[] integerArray = {1, 2, 3, 4, 5};

        // Method 2:
        double[] decimalArray = new double[5];
        for (int i = 0; i < decimalArray.length; i++) {
            decimalArray[i] = i + 1;
        }


        // What can you do with an array?

        // Get its length:

        System.out.println(integerArray.length);

        // Find the element at a specific index:

        System.out.println(integerArray[0]);

        // Print the elements of an array:

        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        // Print the array in reverse:

        for (int i = integerArray.length - 1; i >= 0; i--) {
            System.out.println(integerArray[i]);
        }
    }
}
