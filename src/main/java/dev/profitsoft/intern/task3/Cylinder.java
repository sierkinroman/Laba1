package dev.profitsoft.intern.task3;

import lombok.Data;

@Data
public class Cylinder extends Shape {

    private double radius;

    private double height;

    public Cylinder(double radius, double height) {
        checkRadius(radius);
        checkHeight(height);

        this.radius = radius;
        this.height = height;
    }

    private void checkRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be greater than 0");
        }
    }

    private void checkHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("height must be greater than 0");
        }
    }

    public void setRadius(double radius) {
        checkRadius(radius);
        this.radius = radius;
    }

    public void setHeight(double height) {
        checkHeight(height);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
