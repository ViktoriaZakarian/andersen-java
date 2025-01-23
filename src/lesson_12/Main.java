package lesson_12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] header = {"header 1", "header 2", "header 3"};
        int[][] data = {
                {1, 2, 3},
                {10, 20, 30}
        };

        AppData appData = new AppData(header, data);
        String filePath = "data.csv";

        appData.save(filePath);

        AppData loadedData = AppData.open(filePath);
        if (loadedData != null) {
            System.out.println(Arrays.toString(loadedData.getHeader()));
            for (int[] arr : loadedData.getData()) {
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
