package org.example;

public class Rectangle extends AbstractShape {
    private double l1;
    private double l2;

    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double getArea() {
        double area = l1 * l2;
        return area;
    }

    @Override
    public double getCircumference() {
        double circumference = 2 * (l1 + l2);
        return circumference;
    }
}
