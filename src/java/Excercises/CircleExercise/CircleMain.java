package Excercises.CircleExercise;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        System.out.println("Enter a radius");
        Scanner input = new Scanner(System.in);
        Circle c = new Circle(input.nextDouble());
        System.out.println("The area is: " + c.getArea());
        System.out.println("The perimeter is: " + c.getPerimeter());
        System.out.println("The diameter is:" + c.getDiameter());
    }
}
