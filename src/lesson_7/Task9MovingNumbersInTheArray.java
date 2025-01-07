package lesson_7;

import java.util.Arrays;

public class Task9MovingNumbersInTheArray {

    public static String movingNumbersInTheArray(int[] arr, int n) {
        int number;
        int lastPosition = arr.length - 1;
        if (n > 0) {
            while (n != 0) {
                number = arr[lastPosition];
                for (int i = 0; i < lastPosition; i++) {
                    arr[lastPosition - i] = arr[lastPosition - 1 - i];
                }
                arr[0] = number;
                n--;
            }
        } else {
            while (n != 0) {
                number = arr[0];
                for (int i = 0; i < lastPosition; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[lastPosition] = number;
                n++;
            }
        }
        return Arrays.toString(arr);
    }
}
