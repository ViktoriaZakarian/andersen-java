package lesson_13;

import java.util.*;

public class ArrayOfWords {

    public static void main(String[] args) {
        String[] array = {"test", "java", "automation", "phone", "java", "class", "method", "test", "text", "email",
                "java", "name", "age", "test", "phone", "title", "title"};

        TreeSet<String> set = new TreeSet<>();
        for (String word : array) {
            set.add(word);
        }
        System.out.println(set);

        Map<String, Integer> map = new TreeMap<>();
        Iterator<String> iterator = set.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            String it = iterator.next();
            for (int i = 0; i < array.length; i++) {
                if (it.equals(array[i])) {
                    counter++;
                    map.put(array[i], counter);
                }
            }
            counter = 0;
        }
        System.out.println(map);
    }
}
