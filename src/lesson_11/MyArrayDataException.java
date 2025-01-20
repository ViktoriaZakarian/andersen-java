package lesson_11;

public class MyArrayDataException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid data";
    }
}
