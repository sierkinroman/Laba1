package dev.profitsoft.intern.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CubeTest {

    @Test
    public void createWIthIllegalSideLength() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Cube(0));

        assertEquals("sideLength must be greater than 0", exception.getMessage());
    }

    @Test
    public void setIllegalSideLength() {
        Cube cube = new Cube(4);

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> cube.setSideLength(0));

        assertEquals("sideLength must be greater than 0", exception.getMessage());
    }

    @Test
    public void getVolume() {
        Cube cube = new Cube(3);

        assertEquals(27.0, cube.getVolume());
    }
}