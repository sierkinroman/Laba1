package dev.profitsoft.intern.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
    public void createWithIllegalRadius () {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Cylinder(0, 3));

        assertEquals("radius must be greater than 0", exception.getMessage());
    }

    @Test
    public void createWithIllegalHeight () {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Cylinder(5, 0));

        assertEquals("height must be greater than 0", exception.getMessage());
    }

    @Test
    public void setIllegalRadius() {
        Cylinder cylinder = new Cylinder(4, 2);

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> cylinder.setRadius(0));

        assertEquals("radius must be greater than 0", exception.getMessage());
    }

    @Test
    public void setIllegalHeight() {
        Cylinder cylinder = new Cylinder(4, 2);

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> cylinder.setHeight(0));

        assertEquals("height must be greater than 0", exception.getMessage());
    }

    @Test
    public void getVolume() {
        Cylinder cylinder = new Cylinder(3, 12);

        assertEquals(339.0, Math.floor(cylinder.getVolume()));
    }
}