package lesson_12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData2 {

    private String[] header;
    private int[][] data;

    public AppData2(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void save(String pathToFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile))) {
            for (String str : header) {
                writer.write(str);
                writer.write(";");
            }
            writer.newLine();
            for (int[] arr : data) {
                for (int i = 0; i < arr.length; i++) {
                    if (i != arr.length - 1) {
                        writer.write(String.valueOf(arr[i]));
                        writer.write(";");
                    } else {
                        writer.write(String.valueOf(arr[i]));
                    }
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static AppData2 open(String pathToFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String str;
            String[] header = null;
            if ((str = reader.readLine()) != null) {
                header = str.split(";");
            }
            List<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] nums = line.split(";");
                int[] arr = new int[nums.length];
                for (int i = 0; i < nums.length; i++) {
                    try {
                        arr[i] = Integer.parseInt(nums[i]);
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                }
                dataList.add(arr);
            }
            int [][] data = dataList.toArray(new int[0][]);
            return new AppData2(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
