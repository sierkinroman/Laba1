package dev.profitsoft.intern.task3;

import lombok.Data;

@Data
public class Cube extends Shape {

    private double sideLength;

    public Cube(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("sideLength must be greater than 0");
        }

        this.sideLength = sideLength;
    }

    @Override
    public double volume() {
        return sideLength * sideLength * sideLength;
    }
}
