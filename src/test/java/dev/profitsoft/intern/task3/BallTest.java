package dev.profitsoft.intern.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void illegalRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Ball(0));
    }

    @Test
    void volume() {
        Ball ball = new Ball(4);
        assertEquals(268.0, Math.floor(ball.volume()));
    }
}