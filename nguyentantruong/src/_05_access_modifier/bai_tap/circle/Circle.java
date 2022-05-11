package _05_access_modifier.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final double PI = 3.14;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return getRadius() * 2 * PI;
    }
}
