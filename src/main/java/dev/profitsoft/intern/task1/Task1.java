package dev.profitsoft.intern.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, -8, 0, 23, 8, 12, -7, 23, 0, 1, 1, -2};
        System.out.println(Arrays.toString(Task1.getSortedPositiveNumbers(arr)));
    }

    public static int[] getSortedPositiveNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .filter(e -> e >= 0)
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
