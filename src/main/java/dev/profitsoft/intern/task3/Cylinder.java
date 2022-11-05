package dev.profitsoft.intern.task3;

import lombok.Data;

@Data
public class Cylinder extends Shape {

    private double radius;

    private double height;

    public Cylinder(double radius, double height) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be greater than 0");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("height must be greater than 0");
        }

        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
