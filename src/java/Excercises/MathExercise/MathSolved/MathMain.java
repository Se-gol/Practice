package Excercises.MathExercise.MathSolved;

public class MathMain {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        double[] a = {1, 2, 3, 4, 5};
        System.out.println(Math.sum(a));
        System.out.println(Math.average(a));
        System.out.println(Math.product(a));
        System.out.println(Math.max(a));
        System.out.println(Math.min(a));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.factorial(10));
        Math.fib(10);
        System.out.println(Math.radiansToDegrees(Math.PI));
        System.out.println(Math.degreesToRadians(180));
    }
}
