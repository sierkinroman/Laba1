package dev.profitsoft.intern.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {

    @Test
    public void getSortedPositiveNumbers() {
        int[] arr = {1, 2, -2, 0, 7, -8, -12, 120};
        assertArrayEquals(new int[] {120, 7, 2, 1, 0}, Task1.getSortedPositiveNumbers(arr));
    }

    @Test
    public void getSortedPositiveNumbers_null() {
        assertThrows(NullPointerException.class, () -> Task1.getSortedPositiveNumbers(null));
    }

    @Test
    public void getSortedPositiveNumbers_emptyArray() {
        int[] arr = {};
        assertArrayEquals(new int[0], Task1.getSortedPositiveNumbers(arr));
    }

    @Test
    public void getSortedPositiveNumbers_allNegative() {
        int[] arr = {-1, -2, -3, -4};
        assertArrayEquals(new int[0], Task1.getSortedPositiveNumbers(arr));
    }
}