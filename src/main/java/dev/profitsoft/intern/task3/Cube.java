package dev.profitsoft.intern.task3;

import lombok.Data;

@Data
public class Cube extends Shape {

    private double sideLength;

    public Cube(double sideLength) {
        checkSideLength(sideLength);
        this.sideLength = sideLength;
    }

    private void checkSideLength(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("sideLength must be greater than 0");
        }
    }

    public void setSideLength(double sideLength) {
        checkSideLength(sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}
