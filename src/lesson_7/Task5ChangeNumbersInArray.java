package lesson_7;

import java.util.Arrays;

public class Task5ChangeNumbersInArray {
    public static String changeNumbersInArray() {
        int[] array = {1, 1, 1, 0, 0, 1, 0, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return Arrays.toString(array);
    }
}
