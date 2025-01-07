package lesson_7;

public class Task8TwoDimensionalArray {

    public static void twoDimensionalArray() {
        int[][] arr = new int[7][7];
        int number = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == arr.length - 1 - i) {
                    arr[i][j] = number;
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
