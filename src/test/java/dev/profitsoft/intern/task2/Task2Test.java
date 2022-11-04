package dev.profitsoft.intern.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task2Test {

    private final int howMany = 5;

    @Test
    void getTopHashtags() {
        List<String> rows = new ArrayList<>();
        rows.add("#one#one#two this is #three");
        rows.add("#one#three is #three for #four");
        rows.add("This is #four#four#one #one #two#three");
        rows.add("For#one#two #five#two is #one #two");
        rows.add("seven six#six #one#two");

        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#one", 5);
        expected.put("#two", 4);
        expected.put("#three", 3);
        expected.put("#four", 2);
        expected.put("#five", 1);

        assertEquals(expected, Task2.getTopHashtags(rows, howMany));
    }

    @Test
    void getTopHashtags_sameHashtagsInRow() {
        List<String> rows = new ArrayList<>();
        rows.add("#one one one#one is the one #one");

        Map<String, Integer> actual = Task2.getTopHashtags(rows, howMany);

        assertEquals(1, actual.get("#one"));
    }

    @Test
    void getTopHashtags_incorrectHowMany() {
        assertThrows(IllegalArgumentException.class, () -> Task2.getTopHashtags(Collections.emptyList(), -1));
    }
}