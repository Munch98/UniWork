package org.example;

public class Ellipse extends AbstractShape {
    private double r1;
    private double r2;

    public Ellipse(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double getArea() {
        double area = Math.PI * r1 * r2;
        return area;
    }

    @Override
    public double getCircumference() {
        double circumference = 2 * Math.PI * Math.sqrt(0.5 * (Math.pow(r1, 2) + Math.pow(r2, 2)));

        return circumference;
    }
}
