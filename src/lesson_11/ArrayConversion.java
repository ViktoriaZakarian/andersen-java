package lesson_11;

public class ArrayConversion {

    public static int arrayConversion(String[][] arr) throws MyArrayDataException {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return result;
    }
}
