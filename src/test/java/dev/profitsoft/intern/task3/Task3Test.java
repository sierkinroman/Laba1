package dev.profitsoft.intern.task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void sortShapesByVolume() {
        List<Shape> shapes = new ArrayList<>();
        Cube cube1 = new Cube(1);
        Cube cube2 = new Cube(2);
        Ball ball1 = new Ball(10);
        Ball ball2 = new Ball(20);
        Cylinder cylinder1 = new Cylinder(20, 30);
        Cylinder cylinder2 = new Cylinder(30, 40);
        shapes.add(cube1);
        shapes.add(cube2);
        shapes.add(ball1);
        shapes.add(ball2);
        shapes.add(cylinder1);
        shapes.add(cylinder2);

        Task3.sortShapesByVolume(shapes);

        List<Shape> expected = new ArrayList<>();
        expected.add(cylinder2);
        expected.add(cylinder1);
        expected.add(ball2);
        expected.add(ball1);
        expected.add(cube2);
        expected.add(cube1);

        assertIterableEquals(expected, shapes);
    }

    @Test
    public void sortShapesByVolume_null() {
        assertThrows(NullPointerException.class, () -> Task3.sortShapesByVolume(null));
    }

    @Test
    public void sortShapesByVolume_elementsNull() {
        List<Shape> shapes = new ArrayList<>();
        Cube cube1 = new Cube(1);
        Ball ball1 = new Ball(10);
        shapes.add(null);
        shapes.add(cube1);
        shapes.add(ball1);
        shapes.add(null);

        Task3.sortShapesByVolume(shapes);

        List<Shape> expected = new ArrayList<>();
        expected.add(ball1);
        expected.add(cube1);
        expected.add(null);
        expected.add(null);

        assertIterableEquals(expected, shapes);
    }

    @Test
    public void sortCubes() {
        List<Shape> shapes = new ArrayList<>();
        Cube cube1 = new Cube(1);
        Cube cube2 = new Cube(2);
        Cube cube3 = new Cube(3);
        shapes.add(cube1);
        shapes.add(cube2);
        shapes.add(cube3);

        Task3.sortShapesByVolume(shapes);

        List<Shape> expected = new ArrayList<>();
        expected.add(cube3);
        expected.add(cube2);
        expected.add(cube1);

        assertIterableEquals(expected, shapes);
    }

    @Test
    public void sortBalls() {
        List<Shape> shapes = new ArrayList<>();
        Ball ball1 = new Ball(1);
        Ball ball2 = new Ball(2);
        Ball ball3 = new Ball(3);
        shapes.add(ball1);
        shapes.add(ball2);
        shapes.add(ball3);

        Task3.sortShapesByVolume(shapes);

        List<Shape> expected = new ArrayList<>();
        expected.add(ball3);
        expected.add(ball2);
        expected.add(ball1);

        assertIterableEquals(expected, shapes);
    }

    @Test
    public void sortCylinders() {
        List<Shape> shapes = new ArrayList<>();
        Cylinder cylinder1 = new Cylinder(1, 2);
        Cylinder cylinder2 = new Cylinder(2, 3);
        Cylinder cylinder3 = new Cylinder(3, 4);
        shapes.add(cylinder1);
        shapes.add(cylinder2);
        shapes.add(cylinder3);

        Task3.sortShapesByVolume(shapes);

        List<Shape> expected = new ArrayList<>();
        expected.add(cylinder3);
        expected.add(cylinder2);
        expected.add(cylinder1);

        assertIterableEquals(expected, shapes);
    }
}