package Excercises.CircleExercise;
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public double getPerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }
    public double getDiameter() {
        double Diameter = radius * 2;
        return Diameter;
    }
}
