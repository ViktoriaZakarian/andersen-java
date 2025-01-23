package lesson_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
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
            writer.write(String.join(";", header));
            writer.newLine();
            for (int[] arr : data) {
                writer.write(Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .reduce((a, b) -> a + ";" + b)
                        .orElse(""));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static AppData open(String pathToFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String str;
            if ((str = reader.readLine()) != null) {
                header = str.split(";");
            }
            List<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                int[] array = Arrays.stream(line.split(";"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                dataList.add(array);
            }
            data = dataList.toArray(new int[0][]);
            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
