package lesson_7;

import java.util.Arrays;

public class Task6FillTheArray {
    public static String fillTheArray() {
        int[] array = new int[100];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            number++;
        }
        return Arrays.toString(array);
    }
}
