package lesson_9;

import java.util.List;

public class Dog extends Animal {

    private String name;

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println("Собака не может пробежать больше 500 м");
        } else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println("Собака не может проплыть больше 10 м");
        } else {
            super.swim(length);
        }
    }

    public static int counterOfDogs(List<Animal> animals) {
        int counter = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                counter++;
            }
        }
        return counter;
    }
}
