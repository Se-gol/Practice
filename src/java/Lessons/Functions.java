package Lessons;

public class Functions {
    public static void main(String[] args) {
        // The types of functions in Java:
        // void
        // variables

        // How do you call a Function?

        // Just say its name and give it what it wants ;)
        printHelloWorld();
        System.out.println(sum(1, 2));
    }

    // Creating a void function.
    public static void printHelloWorld() {
        System.out.println("Hello world");
    }

    // Creating a function that returns a variable.
    public static int sum(int a, int b) {
        return a + b;
    }


}
