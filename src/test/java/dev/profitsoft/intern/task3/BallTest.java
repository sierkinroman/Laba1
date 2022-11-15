package dev.profitsoft.intern.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BallTest {

    @Test
    public void createWithIllegalRadius() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Ball(0));

        assertEquals("radius must be greater than 0", exception.getMessage());
    }

    @Test
    public void setIllegalRadius() {
        Ball ball = new Ball(4);

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> ball.setRadius(0));

        assertEquals("radius must be greater than 0", exception.getMessage());
    }

    @Test
    public void getVolume() {
        Ball ball = new Ball(4);

        assertEquals(268.0, Math.floor(ball.getVolume()));
    }
}