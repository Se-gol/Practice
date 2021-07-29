package Lessons;

import java.util.Random;
import java.util.Scanner;

public class Extra {
    public static void main(String... args) {
        // Terminal Input:
        Scanner in = new Scanner(System.in);

        // What can you Input?

        // All the variables:

        int integerInput = in.nextInt();
        double decimalInput = in.nextDouble();
        String stringInput = in.next();
        char characterInput = in.next().charAt(0);

        // Random:

        Random rnd = new Random();

        // random number:

        int randInteger = rnd.nextInt(100); // will return a random number between 0 - 99
        int randomSpecifiedRange = rnd.nextInt(12 - 10 + 1) + 12; // will return a random number between 10 - 12
        int randomSpecifiedRange2 = rnd.nextInt(1000 - 100 + 1) + 100; // will return a random number between 100 - 1000. the formula for a specified range is rnd.nextInt(max - min + 1) + min
        double randDouble = rnd.nextDouble(); // will return a random number between 0 - 1
        boolean bool = rnd.nextBoolean(); // will return either true or false (it's a coin flip)
    }
}
