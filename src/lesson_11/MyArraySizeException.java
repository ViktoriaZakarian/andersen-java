package lesson_11;

public class MyArraySizeException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid size of array";
    }
}
