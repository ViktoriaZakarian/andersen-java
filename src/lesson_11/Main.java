package lesson_11;

public class Main {

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7"}, {"1", "2", "3"}, {"5"}};

        try {
            TwoDimensionalStringArray.infoAboutArray(arr);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(ArrayConversion.arrayConversion(arr));
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
