package Lessons;

public class Conditions {
    public static void main(String[] args) {
        // The types of conditions in Java:
        // if(){ else{}}.
        // switch(case).

        // What can you do with if:

        // Do something if something is true:
        if (2 > 1) {
            System.out.println("2 is bigger than 1");
        }

        // Use else and do something if something isn't true:
        if (1 > 2) {
            System.out.println("1 is bigger than 2");
        } else {
            System.out.println("1 is not bigger than 2");
        }

        // Use && and ||:
        if (2 > 1 && 3 > 2) {
            System.out.println("2 is bigger than 1, and 3 is bigger than 2");
        }

        //Stack it:
        if (2 > 1) {
            System.out.println("2 is bigger than 1");
            if (3 > 2) {
                System.out.println("3 is bigger than 2");
            }

            if (4 > 3) {
                System.out.println("4 is bigger than 3");
            }
        }

        // What can you do with switch?

        // Make your life easier:
        String month = "January";
        switch (month) {
            case "January":
                System.out.println(31);
            case "March":
                System.out.println(31);
            case "April":
                System.out.println(30);
            case "May":
                System.out.println(31);
            case "June":
                System.out.println(30);
            case "July":
                System.out.println(31);
            case "August":
                System.out.println(31);
            case "September":
                System.out.println(30);
            case "October":
                System.out.println(31);
            case "November":
                System.out.println(30);
            case "December":
                System.out.println(31);
        }

        char letter = 'a';
        switch (letter) {
            case 'a':
                System.out.println(1);
            case 'b':
                System.out.println(2);
            case 'c':
                System.out.println(3);
            case 'd':
                System.out.println(4);
            case 'e':
                System.out.println(5);
            case 'f':
                System.out.println(6);
            case 'g':
                System.out.println(7);
            case 'h':
                System.out.println(8);
        }
    }
}
