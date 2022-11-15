package dev.profitsoft.intern.task3;

import lombok.Data;

@Data
public class Ball extends Shape {

    private double radius;

    public Ball(double radius) {
        checkRadius(radius);
        this.radius = radius;
    }

    private void checkRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be greater than 0");
        }
    }

    public void setRadius(double radius) {
        checkRadius(radius);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
