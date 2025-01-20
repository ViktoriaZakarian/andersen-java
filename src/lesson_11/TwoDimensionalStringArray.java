package lesson_11;

import java.util.Arrays;

public class TwoDimensionalStringArray {

    public static void infoAboutArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        for (String[] arr : array) {
            if (arr.length != 4) {
                throw new MyArraySizeException();
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
