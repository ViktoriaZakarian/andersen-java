package lesson_7;

import java.util.Arrays;

public class Task7MultiplyNumbersInTheArray {
    public static String multiplyNumbersInTheArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return Arrays.toString(arr);
    }
}
