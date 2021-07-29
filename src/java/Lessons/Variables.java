package Lessons;

public class Variables {
    public static void main(String[] args) {
        // The types of variables in Java:

        int integer = 1;
        double decimal = 2.5;
        char character = 'a';
        String string = "Hello, World!";
        boolean bool = true;

        // What can you do with numbers (int, double)?

        // Print:
        System.out.println(integer);
        System.out.println(decimal);

        // Add, subtract, multiply, divide, modulo:
        System.out.println(integer + decimal);
        System.out.println(integer - decimal);
        System.out.println(integer * decimal);
        System.out.println(integer / decimal);
        System.out.println(integer % 2);

        // Shortcuts:
        integer++; // Add 1 to itself. (integer = integer + 1).
        integer--; // Subtract 1 from itself. (integer = integer -1).
        integer += 2; // Add however to itself. (integer = integer + 2).
        integer -= 2; // Subtract however to itself. (integer = integer -2).
        integer *= 2; // Multiply however times itself. (integer = integer * 2).
        integer %= 2; // Modulo however and set value to itself. (integer = integer % 2).

        // Check conditions, true or false:
        System.out.println(integer == decimal);
        System.out.println(integer != decimal);
        System.out.println(integer > decimal);
        System.out.println(integer < decimal);
        System.out.println(integer >= decimal);
        System.out.println(integer <= decimal);

        // Use Math class:
        System.out.println(Math.max(integer, decimal));
        System.out.println(Math.min(integer, decimal));
        System.out.println(Math.abs(integer));
        System.out.println(Math.pow(integer, 2));
        System.out.println(Math.sqrt(integer));

        // Cast
        System.out.println((int) decimal);
        System.out.println((double) integer);

        // What can you do with String and char?

        // Get word length:
        System.out.println(string.length());

        // Make lowercase or uppercase (a->A);
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());

        // Get a letter in a specific position:
        System.out.println(string.charAt(0));

        // Get position of a letter:
        System.out.println(string.indexOf('h'));

        // Cut a piece of the word that you want (hello -> lo)
        System.out.println(string.substring(3, 5));

        // Check if strings are equal to each other:
        System.out.println(string.equals("Hello, World!"));

        // Add letters to a word:
        string += character;

        // Sort:
        System.out.println("bcd".compareTo("abc"));

        // What can you do with booleans?

        // Set them equal to a condition:
        bool = false;
        bool = integer > decimal;
        bool = string.equals("Hello, World!");

        // Flip their value:
        bool = !bool;

        // check and, and or:
        bool = true && true; // Will be true.
        bool = false && false; // Will be false.
        bool = true && false; // Will be false.

        bool = true || true; // Will be true.
        bool = false || false; // Will be false.
        bool = true || false; // Will be true.
    }
}
