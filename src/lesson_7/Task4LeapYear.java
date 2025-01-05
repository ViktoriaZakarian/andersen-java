package lesson_7;

public class Task4LeapYear {
    public static boolean isYearLeap(int year) {
        return ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0));
    }
}
