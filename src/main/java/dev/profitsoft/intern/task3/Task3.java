package dev.profitsoft.intern.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cube(20));
        shapes.add(new Cube(2));
        shapes.add(new Cube(8));
        shapes.add(new Ball(6));
        shapes.add(new Ball(60));
        shapes.add(new Ball(12));
        shapes.add(new Cylinder(3, 12));
        shapes.add(new Cylinder(8, 6));
        shapes.add(new Cylinder(17, 4));

        sortShapesByVolume(shapes);

        shapes.forEach(shape -> System.out.println("Volume is " + shape.getVolume() + " : " + shape));
    }

    public static void sortShapesByVolume(List<Shape> shapes) {
        shapes.sort(Comparator.nullsLast(
                Comparator.comparingDouble(Shape::getVolume).reversed()));
    }
}
