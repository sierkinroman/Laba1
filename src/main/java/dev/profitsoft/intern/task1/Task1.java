package dev.profitsoft.intern.task1;

import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, -8, 0, 23, 8, 12, -7, 23, 0, 1, 1, -2};
        System.out.println(Arrays.toString(Task1.getPositiveNumbers(arr)));
    }

    public static int[] getPositiveNumbers(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .filter(e -> e >= 0)
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
