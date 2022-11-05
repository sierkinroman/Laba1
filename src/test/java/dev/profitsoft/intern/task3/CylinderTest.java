package dev.profitsoft.intern.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void illegalRadius () {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(0, 3));
    }

    @Test
    void illegalHeight () {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder(5, 0));
    }

    @Test
    void volume() {
        Cylinder cylinder = new Cylinder(3, 12);
        assertEquals(339.0, Math.floor(cylinder.volume()));
    }
}