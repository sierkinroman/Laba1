package dev.profitsoft.intern.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CubeTest {

    @Test
    void illegalSideLength() {
        assertThrows(IllegalArgumentException.class, () -> new Cube(0));
    }

    @Test
    void volume() {
        Cube cube = new Cube(3);
        assertEquals(27.0, cube.volume());
    }
}