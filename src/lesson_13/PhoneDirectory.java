package lesson_13;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    private Map<String, String> phoneNumberLastName;

    public PhoneDirectory() {
        phoneNumberLastName = new HashMap<>();
    }

    public void add(String phoneNumber, String lastName) {
        phoneNumberLastName.put(phoneNumber, lastName);
    }

    public void get(String lastName) {
        System.out.println(lastName);
        for (Map.Entry<String, String> entry : phoneNumberLastName.entrySet()) {
            if (lastName.equals(entry.getValue())) {
                System.out.println(entry.getKey());
            }
        }
    }
}
