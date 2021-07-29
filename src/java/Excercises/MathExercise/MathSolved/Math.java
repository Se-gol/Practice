package Excercises.MathExercise.MathSolved;

public class Math {
    public static final double PI = 3.14159265359;

    public static double sum(double[] a) {
        double sum = 0;
        for (double value : a) {
            sum += value;
        }
        return sum;
    }

    public static double average(double[] a) {
        return sum(a) / a.length;
    }

    public static double product(double[] a) {
        double product = 1;
        for (double value : a) {
            product *= value;
        }
        return product;
    }

    public static double max(double[] a) {
        double max = Double.MIN_VALUE;
        for (double value : a) {
            if (value > max) max = value;
        }
        return max;
    }

    public static double min(double[] a) {
        double min = Double.MAX_VALUE;
        for (double value : a) {
            if (value < min) min = value;
        }
        return min;
    }

    public static double pow(double number, int power) {
        for (int i = 0; i < power - 1; i++) {
            number *= number;
        }
        return number;
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void fib(int amount) {
        int x = 0;
        int y = 1;
        for (int i = 0; i < amount; i++) {
            System.out.print(x + " ");
            int z = x + y;
            x = y;
            y = z;
        }
        System.out.println();
        int n = 1_000_000;
    }

    public static double radiansToDegrees(double radians) {
        return radians / PI * 180;
    }

    public static double degreesToRadians(double degrees) {
        return degrees * PI / 180;
    }
}
