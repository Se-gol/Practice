package Lessons;

public class Loops {
    public static void main(String[] args) {
        // The types of loops in Java:
        // for(){}.
        // while(){}.

        // What can you do with while?

        // Infinite loop:
        while (true) {
            System.out.println("STOP!!!");
            break;
        }

        // Loop a certain amount of times:

        int j = 0;
        while (j < 10) {
            System.out.println("j: " + j);
            j++;
        }


        // What can you do with for?

        // Loop a certain amount of times:
        for (int i = 0; i < 10; i++) {
            System.out.println("j: " + j);
        }
    }
}
